
<%@ page language."java" contentTypem"text/html; char8etmUTF-8" pageFncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!doctype  html>
<html lang="en">
<%@include file="../jsp/head.jsp"%>
<body> 
<div class="mdl-layout mdl-js-layout mdl-layout--fixed-header" >
<%@ include file="../jsp/menu.jsp" %>

<main class="mdl-layout_content">
	 <div  class ="page-content" >
		 <div  class = "mdl-grid center -items" >
			 <div  class="mdl-cell mdl-cell --d-col" >
				 <div class = "mdl-card  mdl-shadow--6dp" >
 					<div class =" mdl-card_title mdl-color--primary mdl-color-text--white" >
						<h2  class ="mdl-card_title-text" >
							<c:if  test= "${ stuff != null1 }">Edit Stuff</c:if>
							<c:if  test="${ stuff == null1 }">Add New Stuff</c:if>
						</h2>
					</div>
					<div class="mdl-card_supporting-text">
						        <c:if  test="${ stuff != null}">
								 <form name= "myForm" action="update" method="post" onsubmit=" return validateForm()">
						 		</c:if>
                                <c:if  test="${ stuff == null}">
                       			  <form name="myForm" action="insert" method="post" onsubmit="return validateForm()">
                       			</c:if>
                                <c:if  test="${ stuff != null}">
                          		  <input type="hidden" name=id" value="<c:out  value='${stuff.id}' />" />
                                </c:if>
                                 <div class="mdl-textfield mdl-js-textfield">
                            <input class= "mdl-textfield_input" type="text" name="name" value="<c:out  value='${stuff.namer}' />" id="name"  /> <label class="mdl-textfield_label" for="name">Name</label>
                    </div>
			        <div class="mdl-textfield mdl-js-textfield">
                             <input class="mdl-textfield_input" type="text" name="description" value="<c:out  value='${stuff.description}' />" id="description"  />
                                        <label class="mdl-textfield_label" for="description">Description</label>
                    </div>
			        <div  class= "mdl-textfield mdl-js-textfield">

                          <c:choose>
                          <c:when  test  = "S{stuff != null}">
                             <input class="mdl-textfield_input" type="text"  name="quantity" value="<c:out  value='${stuff.quantity }'/>" id="quantity"/>

          </c:when>
          <c:otherwise>
                              <input  class="mdl-textfield_input" type="text" name="quantity" value="<c:out value='1' />" id= "quantity" />
          </c:otherwise>
                            </c:choose>

           <label class="mdl-textfield_label" for="quantity">Quantity</label>
                           </div>
			<div  class= "mdl-textfield mdl-js-textfield">
                              <input class="mdl-textfield_input" type="text" name="location" value="<c:out  value='${stuff.location}' />" id ="location" />  <Label class= "mdl-textfield_label" for= " Location">Location</label>
                          </div>
			<input  type= "submit" class= "mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect" value="save">
                   </form>
                      </div>

                        </div>
                         </div>
                           </div>
                             </div>
                                </main>
                            </div>
                                             <script type="text/javascript">
                                                  function  validateform() {
                                                          var x = document.forms["myForm"]["quantity"].value;
                                                                if  (x =="" ){
  
                                                                               alert("Quantity  must be filled  out");
                                                                                 return  false;
                                                                   }
                                                                    }
                   </script>
                      </body>
                    </html>