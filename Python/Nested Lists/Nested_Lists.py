# Sort the lists using the second element of the sublists
# Inplace way to sort, use of third variable
def Sort(sub_li):
    l = len(sub_li)
    for i in range(0,l):
        for j in range(0,l-i-1):
            if(sub_li[j][1] > sub_li[j+1][1]):
                temp = sub_li[j]
                sub_li[j] = sub_li[j+1]
                sub_li[j+1] = temp
    return sub_li

if __name__ == '__main__':
    records = []
    for _ in range(int(input("Enter the number of students: "))):
        name = input("Enter the name of the Student: ")
        score = float(input("Enter the Grade (Marks in Floating Point) of the Student: "))
        temp = []
        temp.append(name)
        temp.append(score)
        records.append(temp)
        print("The current student entered is ",name,", whose grade is ",score)
        print("The list of student is: ", records)
    print("The list of students is: ", records)

    # SORITNG THE LIST OF STUDENTS BASED ON THE GRADE
    Sort(records)
    print("The sorted list of students is: ",records)

    # Finding the student with second highest number of marks
    max = records[0][1]
    print("Let the highest score in the list be: ", max)
    secondMax = records[0][1]
    print("Let the second highest score in the list be: ", secondMax)
    n = len(records)
    print("The length of the list is: ", n)
    for i in range(2,n):
        print("Loop Number: ", i)
        if(records[i][1]>max):
            secondMax = max
            max = records[i][1]
        elif(records[i][1]>secondMax and max!=records[i][1]):
            secondMax = records[i][1]
        print("The second highest second score after loop ",i," is: ",secondMax)
    print("The second highest score is: ", secondMax)

    # Printing the names of the students with the second highest marks
    while(i>=0):
        if(records[i][1]==secondMax):
            print(records[i][0])
        i=i-1