void selectionSort(int arr[], int length) {
	int min, temp;

	for (int i = 0; i < length; i++)
	{
		min = i;

		for (int j = i + 1; j < length; j++) {
			if(arr[j] < arr[min])
				min = j;
		}

		if (min != i) {
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
}