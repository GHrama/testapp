#!/usr/local/bin/python3

import cgi


#top of html page
def htmlTop():
	print("""Content-type:text/html\n\n
			<!DOCTYPE html>
			<html lang="en">
			<head>
				<meta charset="utf-8"/>
				<title> My server-side template</title>
			</head>
			<body>""")


#bottom of page after the content			
def htmlTail():
print("""</body>
	</html>""")
	

#main program

if __name__ == "__main__":
	try:
		htmlTop()
		htmlTail()
	except:
		cgi.print_exception()
		