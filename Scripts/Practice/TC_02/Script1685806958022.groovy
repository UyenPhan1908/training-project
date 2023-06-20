//2. Cho 1 test data như sau :  [1, 2, 3, 4, 5, 6, 7, 8, 9] ->  viết code gỡ bỏ số chẵn ra khỏi test Data 

List arr = [1, 2, 3, 4, 5, 6, 7, 8, 9] 
for(int i = 0; i < arr.size(); i++) {
	if(arr[i]%2 == 0) {
		arr.remove(i)
	}
}
println('Mang sau khi remove: ' + arr)