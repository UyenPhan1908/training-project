//6.Viết code khi nhập vào số N sẽ trả về danh sách các số chia hết cho chính số đó
//* ví dụ : N = 2 => [2, 4] , N = 3 => [3, 6, 9] , N = 4 => [4, 8, 12, 16],…

int N = 16
List result = []
for(int i = 1; i <= N; i++) {	
		result.add(N*i)
	}
println(result)