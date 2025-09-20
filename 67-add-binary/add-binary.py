class Solution:
    def addBinary(self, a: str, b: str) -> str:
        rem = 0
        i = 0
        j = 0
        st = ""
        while i < len(a) and j < len(b):
            c1 = a[len(a) - i - 1]
            c2 = b[len(b) - j - 1]
            if c1 == "1" and c2 == "1":
                if rem == 1:
                    st += "1"
                else:
                    st += "0"
                rem = 1
            elif c1 == "1" or c2 == "1":
                if rem == 1:
                    st += "0"
                else:
                    st += "1"
                    rem=0
            else:
                st += str(rem)
                rem = 0
            i += 1
            j += 1
            if i==len(a) and j==len(b):
                if rem==1:
                    st+="1"
        while i < len(a):
            c1 = a[len(a) - i - 1]
            # print(c1)
            if c1 == "1":
                if rem == 1:
                    st += "0"
                else:
                    st += "1"
                    rem=0
            else:
                st += str(rem)
                rem = 0
            i += 1
            if i==len(a):
                if rem==1:
                    st+="1"
        while j < len(b):
            c1 = b[len(b) - j - 1]
            if c1 == "1":
                if rem == 1:
                    st += "0"
                else:
                    st += "1"
                    rrem=0
            else:
                st += str(rem)
                rem = 0
            j += 1
            if j==len(b):
                if(rem==1):
                    st+="1"
        i = 0
        j = len(st) - 1
        # print(st)
        s=""
        for i in st:
            s=i+s
            # print(s)

        return s
