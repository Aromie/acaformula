import numpy as np

n = 4
result = np.zeros((n,n))
# 행 고정, 열 증가 (n)
# 열 고정, 행 증가 (n-1)
# 행 고정 , 열 감소 (n-1)
# 열 고정 , 행 감소 (n-2)
i = 0 #행 
j = -1 #열
num = 1
trans_num = 1
while n > 0:
  for _ in range(n):
    j += trans_num
    result[i][j] = num
    
    num += 1
  n -=1

  for _ in range(n):
    i += trans_num
    result[i][j] = num
    
    num += 1
  
  trans_num *= -1

result
