int str_len(char* s)
{
	int len = 0;
	while (s[len])
	{
		len++;
	}
	return len;
}

int kmp(char* s, char* t, int* result)
{
	int pi[1000];
	int m = str_len(t);
	int k = -1;
	int q;
	int n = str_len(s);
	int i;
	int res_len = 0;

	pi[0] = -1;
	for (q = 1; q < m; q++)
	{
		while (k >= 0 && t[k + 1] != t[q])
		{
			k = pi[k];
		}
		if (t[k + 1] == t[q])
		{
			k++;
		}
		pi[q] = k;
	}

	q = -1;
	for (i = 0; i < n; i++)
	{
		while (q >= 0 && t[q + 1] != s[i])
		{
			q = pi[q];
		}
		if (t[q + 1] == s[i])
		{
			q++;
		}
		if (q == m - 1)
		{
			result[res_len] = i - m + 1;
			res_len++;
			q = pi[q];
		}
	}
	return res_len;
}

