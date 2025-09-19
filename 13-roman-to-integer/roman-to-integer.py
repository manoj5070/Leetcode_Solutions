class Solution:
    def romanToInt(self, s: str) -> int:
        stack=[]

        for i in s:
            stack.append(i)
        ans=0
        while len(stack)!=0:
            c=stack.pop()
            if(len(stack)!=0):
                ch=stack[-1]
                if (c=='V' or c=='X') and (ch=='I'):
                    if(c=='V'):
                        ans+=4
                    else:
                        ans+=9
                    stack.pop()
                   
                elif (c=='L' or c=='C') and (ch=='X'):
                    if c=='L':
                        ans+=40
                    else:
                        ans+=90
                    stack.pop()
                elif (c=='D' or c=='M') and (ch=='C'):
                    if(c=='D'):
                        ans+=400
                    else:
                        ans+=900
                    stack.pop()
                else:
                    if(c=='L'):
                        ans+=50
                    elif c=='I':
                        ans+=1
                    elif c=='V':
                        ans+=5
                    elif c=='X':
                        ans+=10
                    elif c=='C':
                        ans+=100
                    elif c=='D':
                        ans+=500
                    elif c=="M":
                        ans+=1000
            else:
                if(c=='L'):
                    ans+=50
                elif c=='I':
                    ans+=1
                elif c=='V':
                    ans+=5
                elif c=='X':
                    ans+=10
                elif c=='C':
                    ans+=100
                elif c=='D':
                    ans+=500
                elif c=="M":
                    ans+=1000           
                    
                
        
        return ans
        