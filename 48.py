# 08/07/2026

from typing import List
class Solution:


    def reverse(self, matrix: List[List[int]]) -> None:

            i = 0
            while i<len(matrix):
                left = 0
                right = len(matrix[0]) - 1
                while left < right:
                    matrix[i][left], matrix[i][right] = matrix[i][right], matrix[i][left]
                    left = left+1
                    right = right - 1
                i = i + 1


    def rotate(self, matrix: List[List[int]]) -> None:
            """
            Do not return anything, modify matrix in-place instead.
            """
            # transpose matrix(swap rows and columns), then invert rows

        
            for i in range(len(matrix)):
                for j in range(i+1, len(matrix)):
                    matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]

            self.reverse(matrix)