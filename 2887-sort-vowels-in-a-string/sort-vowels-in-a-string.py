class Solution:
    def sortVowels(self, s: str) -> str:

        vowel_list=[]
        vowels="aeiouAEIOU"

        for c in s:
            if c in vowels:
                vowel_list.append(c)

        vowel_list.sort()
        result=""
        i=0
        for c in s:
            if c in vowels:
                result+=vowel_list[i]
                i+=1
            else:
                result+=c
        return result

                   