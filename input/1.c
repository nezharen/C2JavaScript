int str_len(char* s)
{
	int len = 0;
	while (s[len])
	{
		len++;
	}
	return len;
}

int Palindrome_checker(char* s)
{
	int i;
	int len = str_len(s);
	for (i = 0; i < len / 2; i++)
	{
		if (s[i] != s[len - i - 1])
		{
			return 0;
		}
	}
	return 1;
}

