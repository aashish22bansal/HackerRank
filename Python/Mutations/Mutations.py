def mutate_string(string, position, character):
    l = list(string)
    l[position] = character
    string1 = ''.join(l)
    return string1

if __name__ == '__main__':
    s = input("Enter the String: ")
    i, c = input("Enter the Position and character together: ").split()
    s_new = mutate_string(s, int(i), c)
    print(s_new)