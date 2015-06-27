int work(int *x, int y)
{
	int a = 3, b = 2;

	a = 2;
	b = 3;
	a = a++;
	c = find(a, b);
	if (a == 2)
	{
		b = 1;
		c = 2;
	}
	else
		c = 3;
	if (Palindrome_checker(a) != 0)
	{
		return -1;
	}

	switch (day)
	{
	case 0:
		a = 2;
		break;
	default:
		b = 3;
		break;
	}

	for (i = 1; i <= n; i++)
		a = a + 1;
	while (a == b)
		a = a + 2;
}

