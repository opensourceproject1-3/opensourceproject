import openpyxl

excelFile = openpyxl.load_workbook('fruit.xlsx')


sheet = excelFile.get_sheet_by_name('Sheet1')


number=101
name=sheet['C1'].value
price=sheet['C1'].value

while(number<=120) :
    index = 'B'+str(number-100)
    name = sheet[index].value
    #print(name)

    index1 = 'C'+str(number-100)
    price = sheet[index1].value

    if(number%2==0):
        storenum = int(number/2)
    else:
        storenum = int((number+1)/2)


    #print(price)
    result = "insert into PRODUCT values ('PRODUCT_" + str(number) + "', '" + str(name) + "', '" + str(price) + "','sehwa98.dothome.co.kr/images/PRODUCT_" +str(number)+".jpg', 'STORE_"+str(storenum)+"', 'CATEGORY_4');"
    print(result)
    number += 1