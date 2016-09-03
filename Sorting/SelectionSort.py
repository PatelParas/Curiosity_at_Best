"""
    Discription : https://en.wikipedia.org/wiki/Selection_sort
    Input :  [11, 3, 4, 9, -2, 6, 3, 9, 11, 7]
    Output : [-2, 3, 3, 4, 6, 7, 9, 9, 11, 11]
    Complexity : Worst, Best, Avg = O(n^2)
    Author : Paras Patel
"""

inp_arr = [11, 3, 4, 9, -2, 6, 3, 9, 11, 7]
def selectionsort(inp_arr):
    for i in xrange(0, len(inp_arr)):
		index = i
		for j in xrange(index+1, len(inp_arr),1):
			if inp_arr[j] < inp_arr[index] :
				index = j
		inp_arr[i], inp_arr[index] = inp_arr[index], inp_arr[i] # Value Swaping
    return inp_arr

print selectionsort(inp_arr)
