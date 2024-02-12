from random import randint, seed
from time import time

def getRandom():
    return randint(3,456)


seed(time())

order = [False for i in range(457)]

cnt = 0
while cnt < 50:
    temp = getRandom()
    
    if order[temp]:
        continue
    
    order[temp] = True
    cnt += 1

selected = []
for i in range(len(order)):
    if order[i]:
        selected.append(i)

print(selected)