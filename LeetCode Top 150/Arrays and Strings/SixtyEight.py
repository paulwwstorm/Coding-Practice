class Solution:
    def fullJustify(words, maxWidth):
        justified = []
        current_line = []
        current_length = 0
        number_of_words = 0

        while True:
            current_word = ""
            try:
                current_word = words[0]
                words.pop(0)
            except:
                break

            if ((current_length + number_of_words) + (len(current_word))) > maxWidth:
                formatted_line = ""
                if number_of_words == 1:
                    formatted_line += current_line[0]
                    for x in range(maxWidth - current_length):
                        formatted_line += " "
                else:
                    white_space = (
                        int(
                            (maxWidth - (current_length + (number_of_words - 1)))
                            / (number_of_words - 1)
                        )
                        + 1
                    )
                    extra_white_space = int(
                        (maxWidth - current_length) % (number_of_words - 1)
                    )
                    for x in range(len(current_line) - 1):
                        for y in range(white_space):
                            current_line[x] += " "
                        if extra_white_space > 0:
                            current_line[x] += " "
                            extra_white_space -= 1
                        formatted_line += current_line[x]

                    formatted_line += current_line[-1]
                justified.append(formatted_line)
                current_line = [current_word]
                current_length = len(current_word)
                number_of_words = 1
            else:
                current_line.append(current_word)
                current_length += len(current_word)
                number_of_words += 1

        # Format final line
        final_line = ""
        for x in range(len(current_line) - 1):
            final_line += current_line[x] + " "

        final_line += current_line[-1]

        white_space = maxWidth - len(final_line)

        for y in range(white_space):
            final_line += " "

        justified.append(final_line)

        return justified
