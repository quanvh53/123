def is_triangle(a,b,c):
    if (a<b+c and b<c+a and c<a+b):
        return True
    else :
        return False

def tg_deu(a,b,c):
    if (a==b==c):
        return True
    else :
        return False

def tg_can(a,b,c):
    if (a==b or b==c or c==a):
        return True
    return False

def main(a,b,c):
    '''
    a:[0;10][11;20][21;50]
    b:[20;10]
    c:[0;10][11;20]
    '''

    if is_triangle(a,b,c):
        if tg_deu(a,b,c):
            return 'tam giac deu'
        elif tg_can(a,b,c):
            return 'tam giac can'
        else :
            return 'tam giac thuong'
    else :
        return 'khong phai tam giac'
    
