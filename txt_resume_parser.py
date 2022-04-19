from collections import defaultdict
from pdfminer.pdfinterp import PDFResourceManager, PDFPageInterpreter#process_pdf
from pdfminer.pdfpage import PDFPage
from pdfminer.converter import TextConverter
from pdfminer.layout import LAParams
import io
import re
from nltk.tokenize import word_tokenize
from collections import OrderedDict
import pandas as pd
import nltk
import glob
from pathlib import Path
from tqdm import tqdm
import progressbar



# change the directory name for resumes in pdf format
li=[]
my_path='Training Data'
for files in  glob.glob(my_path + '/**/*.pdf', recursive=True):
    li.append(files)


# converting .pdf ext to .txt format

mapper=list(map(lambda x :x.replace('.pdf','.txt'),li))

rectified=[i.split('/')[-1] for i in mapper]




# extracting text data from resumes
def  pdf_to_txt(path):
    rsrcmgr = PDFResourceManager()
    retstr = io.StringIO()
    codec = 'utf-8'
    laparams = LAParams()
    device = TextConverter(rsrcmgr, retstr, codec=codec, laparams=laparams)
    fp = open(path, 'rb')
    interpreter = PDFPageInterpreter(rsrcmgr, device)
    password = ""
    maxpages = 0
    caching = True
    pagenos=set()

    for page in PDFPage.get_pages(fp, pagenos, maxpages=maxpages, password=password,caching=caching, check_extractable=True):
        interpreter.process_page(page)

    text = retstr.getvalue()

    fp.close()
    device.close()
    retstr.close()
    return text



# progress bar for displaying progress while processing all resumes

bar = progressbar.ProgressBar(maxval=len(rectified),widgets=[progressbar.Bar('='), ' ', progressbar.Percentage()])
bar.start()

for index,resumes in enumerate(li):
    data=pdf_to_txt(resumes)
    txt_file='/home/pulkit-garg/Desktop/txt_resumes/'+rectified[index]
    with open(txt_file,'w+') as f:
        f.write(data)
    bar.update(index+1)
    
    f.close()

bar.finish()


