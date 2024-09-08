def find_duplicates_nested_loop(l: list) -> list:
    # Tracking duplicates in a set to avoid duplicate values in return list
    duplicatesSet = set()

    for i in l:
        count = 0
        for j in l:
            if i == j:
                count += 1
        
        # Count will be greater than two if there is a duplicate value, one if not, because it counts itself.
        if count >= 2:
            duplicatesSet.add(i)
    
    # Convert to list before returning.
    duplicatesList = list(duplicatesSet)
    return duplicatesList

def find_duplicates_dictionary(l: list) -> list:
    countDict = {}

    # If an integer is not in the dictionary, add it as a key with value of 1. Else, increment key by 1.
    for i in l:
        if i not in countDict.keys():
            countDict[i] = 1
        else:
            countDict[i] += 1
    
    duplicatesSet = set()
    for key in countDict:
        if countDict[key] >= 2:
            duplicatesSet.add(key)
    
    # Convert to list before returning.
    duplicatesList = list(duplicatesSet)
    return duplicatesList

if __name__ == "__main__":
    sample1 = [3, 7, 5, 6, 7, 4, 8, 5, 7, 66]
    sample2 = [3, 5, 6, 4, 4, 5, 66, 6, 7, 6]
    sample3 = [3, 0, 5, 1, 0]
    sample4 = [3]
    
    print("Sample 1:", find_duplicates_nested_loop(sample1))
    print("Sample 2:", find_duplicates_nested_loop(sample2))
    print("Sample 3:", find_duplicates_nested_loop(sample3))
    print("Sample 4:", find_duplicates_nested_loop(sample4))