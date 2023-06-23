//3. Viết code đếm từ [1 - 100] có bao nhiêu số chia hết cho 7 ?

List arr = []
List a = []
for(int i = 0; i < 100; i++) {
	arr.add(i+1)	
}
for(i = 0; i < arr.size(); i++) {
	if(arr[i]%7 == 0) {
		a.add(arr[i])
		println(a)
	}
}
println('Cac so chia het cho 7 trong mang tu 1 -> 100 la: ' + a.size() + ' so')