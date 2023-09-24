class Solution:
    def fullJustify(words, maxWidth):
        justified = []
        current_line = []
        current_length = 0
        number_of_words = 0

        while(True):
            current_word = ""
            try:
                current_word = words[0]
                words.pop(0)
            except:
                break

            if ((current_length + (len(current_word) + 1)) > 16):
                formatted_line = ""
                if (number_of_words == 1):
                    formatted_line += current_line[0]
                    print("one word line")
                    print("current_length: " + str(current_length))
                    for x in range(16 - current_length):
                        formatted_line += " "
                else:
                    white_space = int((16 - current_length) / (number_of_words - 1)) + number_of_words
                    extra_white_space = int((16 - current_length) % (number_of_words - 1))
                    for x in range(len(current_line) - 1):
                        for y in range(white_space):
                            current_line[x] += " "
                        if (x == 0):
                            for z in range(extra_white_space):
                                current_line[x] += " "
                        formatted_line += current_line[x]

                    formatted_line += current_line[-1]
                justified.append(formatted_line)
                current_line = [current_word]
                current_length = len(current_word) + 1
                number_of_words = 1
            else:
                current_line.append(current_word)
                current_length += len(current_word) + 1
                number_of_words += 1

        # Format final line
        white_space = int(((16 - current_length) / (number_of_words * 2)) + number_of_words)

        final_line = ""
        for x in range(len(current_line)):
            final_line += current_line[x] + " "

        for y in range(white_space):
            final_line += " "
        
        justified.append(final_line)

        return justified

    words1 = ["This", "is", "an", "example", "of", "text", "justification."]
    maxWidth1 = 16
    words2 = ["What","must","be","acknowledgment","shall","be"]
    maxWidth2 = 16
    words3 = ["Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"]
    maxWidth3 = 20

    # print(fullJustify(words1, maxWidth1))
    print(fullJustify(words2, maxWidth2))
    # print(fullJustify(words3, maxWidth3))






