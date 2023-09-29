class TwentyEight:
    def strStr(haystack: str, needle: str) -> int:
        for x in range(len(haystack) - (len(needle)-1)):
            if (haystack[x] == needle[0]):
                y = 0
                for y in range(len(needle)):
                    if (haystack[x + y] != needle[y]):
                        y = 0
                        break
                if (y == (len(needle) - 1)):
                    return x


        return -1
    
    haystack1 = "sadbutsad"
    needle1 = "sad"
    haystack2 = "leetcode"
    needle2 = "leeto"
    haystack3 = "hello"
    needle3 = "ll"
    haystack4 = "a"
    needle4 = "a"

    print(strStr(haystack1, needle1))
    print(strStr(haystack2, needle2))
    print(strStr(haystack3, needle3))
    print(strStr(haystack4, needle4))