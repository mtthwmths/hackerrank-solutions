#!/bin/python3

import sys

n = int(input().strip())

count = 1
stairs = [" "] * n 
while count <= n:
    #n - count spaces and count Hashemtaggems
    showStep = ""
    stairs[n - count] = "#"
    #used to debug how string was changed -- print(stairs)
    for step in stairs:
        showStep = showStep + step
    print(showStep)
    count += 1
