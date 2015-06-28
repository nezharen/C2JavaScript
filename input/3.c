float calc_one_step(char sign, float a, float b)
{
	switch (sign)
	{
	case '+':
		return a + b;
	case '-':
		return a - b;
	case '*':
		return a * b;
	case '/':
		return a / b;
	}
}

float calc_exp(char* s)
{
	float num_stack[100];
	num_stack[0] = 0.0;
	int num_stack_top = 0;
	char sign_stack[100];
	sign_stack[0] = '#';
	int sign_stack_top = 0;
	float temp;
	int num_flag = 0;
	int i = 0;
	char c = 0;
	while (s[i])
	{
		c = s[i];
		if (c >= '0' && c <= '9')
		{
			if (num_flag == 0)
			{
				num_flag = 1;
				temp = 0.0;
			}
			temp = temp * 10 + c - '0';
		}
		else
		{
			if (num_flag == 1)
			{
				num_flag = 0;
				num_stack_top++;
				num_stack[num_stack_top] = temp;
				while (sign_stack[sign_stack_top] == '*' || sign_stack[sign_stack_top] == '/')
                                {
					temp = calc_one_step(sign_stack[sign_stack_top], num_stack[num_stack_top - 1], num_stack[num_stack_top]);
					sign_stack_top--;
					num_stack_top--;
					num_stack[num_stack_top] = temp;
                                }
			}
			switch (c)
			{
			case ')':
				while (sign_stack[sign_stack_top] != '(')
				{
					temp = calc_one_step(sign_stack[sign_stack_top], num_stack[num_stack_top - 1], num_stack[num_stack_top]);
					sign_stack_top--;
					num_stack_top--;
					num_stack[num_stack_top] = temp;
				}
				sign_stack_top--;
				while (sign_stack[sign_stack_top] == '*' || sign_stack[sign_stack_top] == '/')
				{
					temp = calc_one_step(sign_stack[sign_stack_top], num_stack[num_stack_top - 1], num_stack[num_stack_top]);
					sign_stack_top--;
					num_stack_top--;
					num_stack[num_stack_top] = temp;
				}
				break;
			case '*':
			case '/':
			case '(':
				sign_stack_top++;
				sign_stack[sign_stack_top] = c;
				break;
			case '+':
			case '-':
				while (sign_stack[sign_stack_top] == '+' || sign_stack[sign_stack_top] == '-')
				{
					temp = calc_one_step(sign_stack[sign_stack_top], num_stack[num_stack_top - 1], num_stack[num_stack_top]);
					sign_stack_top--;
					num_stack_top--;
					num_stack[num_stack_top] = temp;
				}
				sign_stack_top++;
				sign_stack[sign_stack_top] = c;
				break;
			}
		}
		i++;
	}
	if (num_flag == 1)
	{
		num_stack_top++;
		num_stack[num_stack_top] = temp;
	}
	while (sign_stack_top > 0)
	{
		temp = calc_one_step(sign_stack[sign_stack_top], num_stack[num_stack_top - 1], num_stack[num_stack_top]);
		sign_stack_top--;
		num_stack_top--;
		num_stack[num_stack_top] = temp;
	}
	return num_stack[num_stack_top];
}

int main()
{
	char exp[100] = "1+(5-2)*4/(2+1)";
	if (calc_exp(exp) - 5 < 0.0001) {
		return 1;
	}
	return 0;
}
