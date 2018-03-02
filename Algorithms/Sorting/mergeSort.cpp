void merge(int arr[], int start, int middle, int end) {
	int i, j, k;
	int leftHalf = middle - start + 1;
	int rightHalf = end - middle;

	int left[leftHalf]; 
	int right[rightHalf];

	for(i = 0; i < leftHalf; i++)
		left[i] = arr[start + i];
	for(j = 0; j < rightHalf; j++)
		right[j] = arr[middle + 1 + j];

	i = 0;
	j = 0;
	k = start;

	while(i < leftHalf && j < rightHalf) {
		if(left[i] <= right[j]) {
			arr[k] = left[i];
			i++;
		}
		else {
			arr[k] = right[j];
			j++;
		}

		k++;
	}

	while(i < leftHalf) {
		arr[k] = left[i];
		i++;
		k++;
	}

	while(j < rightHalf) {
		arr[k] = right[j];
		j++;
		k++;
	}
}

void mergeSort(int arr[], int start, int end) {
	if (start < end) {
		int middle = (start + (end - start) / 2);

		mergeSort(arr, start, middle);
		mergeSort(arr, middle + 1, end);

		merge(arr, start, middle, end);
	}
}