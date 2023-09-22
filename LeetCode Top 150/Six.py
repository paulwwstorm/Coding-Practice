class Solution:
    def convert(self, s: str, numRows: int) -> str:
        # So what we want is start with the first element and then take the (n + (n - 1))th row
        # then start with 