def count_substring(string, sub_string):
    sub1 = list(string)
    sub2 = list(sub_string)
    count = 0
    for i in range(0,(len(string)-len(sub_string))):
        sub = string[i:i+len(sub_string)]
        if(sub.find(sub_string)==1):
            count = count + 1
    return count

if __name__ == '__main__':
    string = input("Enter the String: ").strip()
    sub_string = input("Enter the Sub-string: ").strip()
    
    count = count_substring(string, sub_string)
    print(count)