## JSR 349 bean validation 1.1 with Hibernate Validator on OSGi

Prerequisites: Java 8 and Maven 3.5.0

Download Apache Karaf 4.1.5, extract and startup

   https://karaf.apache.org/download.html

Build this project root with mvn:install producing a Karaf Archive file (kar-1.0.0.kar)

Drop this file into the deploy folder found under the Karaf main folder to install all needed bundles at once.
The Karaf console will output the following:

    Field name: status
    Violation: status must be greater than or equal to 1


###bean-validation-osgi License

Copyright (C) 2018 Maurice Betzel
 
 Licensed either under the Apache License, Version 2.0, or (at your option)
 under the terms of the GNU General Public License as published by
 the Free Software Foundation (subject to the "Classpath" exception),
 either version 2, or any later version (collectively, the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at
 
      http://www.apache.org/licenses/LICENSE-2.0
      http://www.gnu.org/licenses/
      http://www.gnu.org/software/classpath/license.html
 
 or as provided in the LICENSE.txt file that accompanied this code.
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.

###hibernate validator:

http://docs.jboss.org/hibernate/validator/5.4/reference/en-US/html_single/