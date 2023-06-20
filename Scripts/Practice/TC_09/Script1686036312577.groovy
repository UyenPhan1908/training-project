//9. Tạo 1 data hashmap tên INFO gồm 'Tên, Năm Sinh, Chiều cao' với gía trị tùy ý -> Viết code  tính số tuổi và thêm tuổi vào data đã tạo (đến năm hiện tại)
//Integer.valueOf(t) : chuyen tu kieu string sang kieu int

def info = ["Ten":"Nguyen Van A", "Nam sinh":"1990", "Chieu cao":"180"]
String t = info.get("Nam sinh")

int t1 = 2023 - Integer.valueOf(t)
def tuoi = ["Tuoi":t1]
info.putAll(tuoi)
println(info)