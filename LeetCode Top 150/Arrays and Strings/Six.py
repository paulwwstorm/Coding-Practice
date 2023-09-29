class Solution:
    def convert(s, num_rows) -> str:
        # So what we want is start with the first element and then take the (n + (n - 1))th row
        # This will work first row
        # Basically the zigzags are every other column is missing the first and last row
        # Then we take the number n * 2 - 1 as our base
        final_string = ""
        iterator1 = (num_rows * 2) - 4
        iterator2 = 2

        if (num_rows == 1):
            return s
        
        for x in range(num_rows):
            pos = x
            character = ""
            iterator_switch = 0
            if (pos == 0 or pos == num_rows - 1):
                while(pos < len(s)):
                    character = s[pos]
                    final_string += character
                    pos += num_rows * 2 - 2
            else:
                while(pos < len(s)):
                    character = s[pos]
                    final_string += character
                    if (iterator_switch == 0):
                        iterator_switch = 1
                        pos += iterator1
                    else:
                        iterator_switch = 0
                        pos += iterator2
                
                iterator1 -= 2
                iterator2 += 2

        return final_string

    str1 = str("PAYPALISHIRING")
    row1 = int(3)
    output1 = "PAHNAPLSIIGYIR"
    str2 = str("PAYPALISHIRING")
    row2 = int(4)
    output2 = "PINALSIGYAHRPI"
    str3 = str("A")
    row3 = int(1)
    output3 = "A"


    print(convert(str1, row1) == output1)
    print(convert(str2, row2) == output2)
    print(convert(str3, row3) == output3)
