# BMI Testing
Assignment for Software Engineering

## Introduction
Đây là source code cho bài tập về nhà tuần 13 môn Công nghệ Phần mềm.

## Files
Trong folder src có:
- Folder `Source` chứa file source code chính: `BMI.java`
- Folder `Test` chứa các file kiểm thử:
  - `BMIPartitionInputTest.java` -> Kiểm thử phân hoạch đầu vào
  - `BMIPartitionOutputTest.java` -> Kiểm thử phân hoạch đầu ra
  - `BMIBoundaryValueTest.java`-> Kiểm thử giá trị biên
- Bên ngoài có 1 file kiểm thử chung `BMITest.java`

## Overview
Kết quả của chương trình kiểm thử:  
- Passed: 14 test
- Phát hiện 7 test lỗi  

![image](https://user-images.githubusercontent.com/79621768/168628569-7a2b3bc8-a9e3-42cd-a6b4-49a3075451f5.png)

## Summary
- Kiểm thử phân hoạch đầu vào phát hiện được lỗi: Invalid Input của cả weight và height.
- Kiểm thử phân hoạch đầu ra phát hiện được lỗi: Invalid Input (không rõ của weight hay height) và lỗi trả về kết quả sai.
- Kiểm thử giá trị biên phát hiện được lỗi: Invalid Input của cả weight và height.
