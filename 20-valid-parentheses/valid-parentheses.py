class Solution:
    def isValid(self, s: str) -> bool:
        st=[]

        for i in s:
            if i=='{' or i=='[' or i=='(':
                st.append(i)
            elif len(st)>0:
                c=st.pop()
                if (c=='(' and i==')') or (c=='{' and i=='}') or (c=='[' and i==']'):
                    pass
                else:
                    return False
            else:
                return False

        if len(st)==0:
            return True
        return False
        