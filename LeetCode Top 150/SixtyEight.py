class Solution:
    def fullJustify(self, words: List[str], maxWidth: int) -> List[str]:
        justified = []
        current_line = []
        current_length = 0

        for x in range(len(words)):
            if ((current_length + len(words[x]) > 16)):
                # format line
                print("formatting line")
                current_line = [words[x]]
                current_length = len(words[x])
            else:
                current_line.append(words[x])
                current_length += len(words[x])
