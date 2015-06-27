int str_len(char* s)
{
	int len = 0;
	while (*s != '\0')
	{
		len++;
		s++;
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

int main()
{
	char a[10] = "abcdefe";
	if (Palindrome_checker(a) != 0)
	{
		return -1;
	}
	char b[10] = "abababa";
	if (Palindrome_checker(b) != 1)
	{
		return -1;
	}
	return 0;
}
