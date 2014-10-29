#
#
#import org.appdynamics.appdrestapi.RESTAccess;
#import org.appdynamics.appdrestapi.data.*;
#import sys
from org.appdynamics.appdrestapi import RESTAccess

access = RESTAccess("controller3.demo.appdynamics.com","443",True,"demouser","apm13ad3r","customer1")
print access.getApplications()
print "Hello\n"
