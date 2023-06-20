//5. Viết code khi nhập vào số N sẽ trả về  hashmap có N phần tử
//* Giá trị phần tử là tùy ý
//* ví dụ: N = 2 => ["Key_1" : Value_1 , "Key_2": Value_2]

import org.apache.commons.lang.RandomStringUtils

int N = 6
def hashmap = [:]
for(int i = 0; i < N; i++) {
	String t1 = RandomStringUtils.randomAlphabetic(3)
	String t2 = RandomStringUtils.randomAlphabetic(3)
	hashmap.put(t1,t2)
}
println(hashmap)