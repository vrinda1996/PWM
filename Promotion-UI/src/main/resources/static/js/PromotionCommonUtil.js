/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

function  validateArticleORMCCode(isArticleEntered,mcCode,articleCode,txtArticleNoId,txtArticleDescId,txtMCCodeId,txtMCDescId,mstPromoID,IsInitiationFlag){
    if((articleCode ==undefined || articleCode==null || articleCode.length==0) && (mcCode ==undefined || mcCode==null || mcCode.length==0) ){
        alert("Please enter article code OR MC code.");
        if(txtArticleNoId!=undefined || txtArticleNoId.length>0){
            $("#"+txtArticleNoId).focus();
            $("#"+txtArticleNoId).val("");            
        }
        if(txtArticleNoId!=undefined || txtArticleNoId.length>0){
            $("#"+txtMCCodeId).val("");
        }
        return false;
    }
    if( (articleCode!=undefined  && articleCode.length>0)&& (mcCode!=undefined && mcCode.length>0)){
        alert("Please enter article code OR MC code.");
        if(txtArticleNoId!=undefined || txtArticleNoId.length>0){
            $("#"+txtArticleNoId).focus();
            $("#"+txtArticleNoId).val("");
            
        }
        if(txtArticleNoId!=undefined || txtArticleNoId.length>0){
            $("#"+txtMCCodeId).val("");
        }
        return false;
    }
    if( articleCode !=undefined && articleCode.length>0 ){
        //        alert("IsInitiationFlag: "+IsInitiationFlag);
        //        alert("mst Promo : "+mstPromoID);
        if (IsInitiationFlag=="1"){
            if(mstPromoID==undefined){
                alert("Please select request.");
                return false;
            }else if(mstPromoID==null){
                alert("Please select request.");
                return false;
            }else if(mstPromoID.length==0){
                alert("Please select request.");
                return false;
            }
            
        }else{
            mstPromoID="0";
        }
        if(!isNumeric(articleCode)){
            alert("Article code should be numeric.");
            if(txtArticleNoId!=undefined || txtArticleNoId.length>0){
                $("#"+txtArticleNoId).focus();
                $("#"+txtArticleNoId).val("");
            }
            return false;
        }else if(articleCode.length > 18){
            if(txtArticleNoId!=undefined || txtArticleNoId.length>0){
                $("#"+txtArticleNoId).focus();
                $("#"+txtArticleNoId).val("");
            }
            alert("Article code  should not be greater than 18 Characters.");
            return false;
        }
        isArticleEntered=1;                        
    }else if( mcCode !=undefined && mcCode.length>0 ){
        if (IsInitiationFlag=="1"){
            if(mstPromoID==undefined){
                alert("Please select request.");
                return false;
            }else if(mstPromoID==null){
                alert("Please select request.");
                return false;
            }else if(mstPromoID.length==0){
                alert("Please select request.");
                return false;
            }
            
        }else{
            mstPromoID="0";
        }
        if(!isNumeric(mcCode)){
            alert("MC code should be numeric.");
            if(txtMCCodeId!=undefined || txtMCCodeId.length>0){
                $("#"+txtMCCodeId).focus();
                $("#"+txtMCCodeId).val("");
            }
            return false;
        }else if(mcCode.length > 18){            
            alert("MC code  should not be greater than 18 Characters.");
            if(txtMCCodeId!=undefined || txtMCCodeId.length>0){
                $("#"+txtMCCodeId).focus();
                $("#"+txtMCCodeId).val("");
            }
            return false;
        }
        isArticleEntered=0;                        
    }


    $.ajax({
        url: "validateArticleORMCCode?isArticleEntered="+isArticleEntered+"&mcCode="+mcCode+"&articleCode="+articleCode+"&mstPromoId="+mstPromoID+"&IsInitiationFlag="+IsInitiationFlag,
        global: false,
        type: "POST",
        dataType: "json",
        contanttype: 'text/json',
        async:false,
        cache:false,
        success:
        function(data){
            var arr=new Array();
            if(data.respCode=="0"){

                if(txtArticleNoId!=undefined || txtArticleNoId.length>0){
                    $("#"+txtArticleNoId).focus();
                    $("#"+txtArticleNoId).val('');
                }
                $("#btnAddArticle").attr("disabled", true);
                $("#btnValidateArticle").attr("disabled", false);

                return false;
            }else{
                if(txtArticleNoId!=undefined || txtArticleNoId.length>0){
                    $("#"+txtArticleNoId).val(data.articleCode);
                    $("#"+txtArticleNoId).attr("disabled", true);
                }
                if(txtArticleDescId!=undefined || txtArticleDescId.length>0){
                    $("#"+txtArticleDescId).val(data.articleDesc);
                    $("#"+txtArticleDescId).attr("disabled", true);
                }
                if(txtMCCodeId!=undefined || txtMCCodeId.length>0){
                    $("#"+txtMCCodeId).val(data.mcCode);
                    $("#"+txtMCCodeId).attr("disabled", true);
                }

                if(txtMCDescId!=undefined || txtMCDescId.length>0){
                    $("#"+txtMCDescId).val(data.mcDesc);
                    $("#"+txtMCDescId).attr("disabled", true);
                }
                $("#btnAddArticle").attr("disabled", false);
                $("#btnValidateArticle").attr("disabled", true);
            }
            
        }
    });
}

function  validatePromotionArticleORMCCode(isArticleEntered,mcCode,articleCode,txtArticleNoId,txtArticleDescId,txtMCCodeId,txtMCDescId,txtBrandCodeId,txtBrandDescId,mstPromoID,IsInitiationFlag, txtRebateRate,txtSettlementPartner,txtCategoryName,txtDeptName, rebateRate, settlementPartner, CategoryName){     
    //alert("called");
    if((articleCode ==undefined || articleCode==null || articleCode.length==0) && (mcCode ==undefined || mcCode==null || mcCode.length==0) ){
        if(txtArticleNoId!=undefined || txtArticleNoId.length>0){
            $("#"+txtArticleNoId).focus();
            $("#"+txtArticleNoId).val("");
        }
        if(txtArticleNoId!=undefined || txtArticleNoId.length>0){
            $("#"+txtMCCodeId).val("");
        }
        return [false,'Please enter article code OR MC code.'];
    }
    if( (articleCode!=undefined  && articleCode.length>0)&& (mcCode!=undefined && mcCode.length>0)){
        if(txtArticleNoId!=undefined || txtArticleNoId.length>0){
            $("#"+txtArticleNoId).focus();
            $("#"+txtArticleNoId).val("");

        }
        if(txtArticleNoId!=undefined || txtArticleNoId.length>0){
            $("#"+txtMCCodeId).val("");
        }
        return [false,'Please enter article code OR MC code.'];
    }   
    
    if( articleCode !=undefined && articleCode.length>0 ){
        //        alert("IsInitiationFlag: "+IsInitiationFlag);
        //        alert("mst Promo : "+mstPromoID);
        if (IsInitiationFlag=="1"){
            if(mstPromoID==undefined){
                return [false,'Please select request.'];
            }else if(mstPromoID==null){
                return [false,'Please select request.'];
            }else if(mstPromoID.length==0){
                return [false,'Please select request.'];
            }

        }else{
            mstPromoID="0";
        }
        if(!isNumeric(articleCode)){
            if(txtArticleNoId!=undefined || txtArticleNoId.length>0){
                $("#"+txtArticleNoId).focus();
                $("#"+txtArticleNoId).val("");
            }
            return [false,'Article code should be numeric.'];
        }else if(articleCode.length > 18){
            if(txtArticleNoId!=undefined || txtArticleNoId.length>0){
                $("#"+txtArticleNoId).focus();
                $("#"+txtArticleNoId).val("");
            }
            return [false,'Article code should not be greater than 18 Characters.'];
        }
        
         if(!isNumeric(rebateRate)){
            if(txtRebateRate!=undefined || txtRebateRate.length>0){
                $("#"+txtRebateRate).focus();
                $("#"+txtRebateRate).val("");
            }
            return [false,'Rebate Rate should be numeric.'];
        }
        if(!isIntegerOrNull(settlementPartner)){
            if(txtSettlementPartner!=undefined || txtSettlementPartner.length>0){
                $("#"+txtSettlementPartner).focus();
                $("#"+txtSettlementPartner).val("");
            }
            return [false,'Settlement Partner should be numeric.'];
        }
        if(!checkFixedLength(settlementPartner,'Settlement Partner',6,10)){
            if(txtSettlementPartner!=undefined || txtSettlementPartner.length>0){
                $("#"+txtSettlementPartner).focus();
                $("#"+txtSettlementPartner).val("");
            }
            return [false,'Settlement Partner length should be between 6 and 10'];
        }
        if(!isAlphabetic(CategoryName,'Category Person Name')){
            if(txtCategoryName!=undefined || txtCategoryName.length>0){
                $("#"+txtCategoryName).focus();
                $("#"+txtCategoryName).val("");
            }
            return [false,'Category Person Name is not valid'];
        }
        if(!checkLength(CategoryName,'Category Person Name',50)){
            if(txtCategoryName!=undefined || txtCategoryName.length>0){
                $("#"+txtCategoryName).focus();
                $("#"+txtCategoryName).val("");
            }
            return [false,'Category Person Name should not be more than 50 characters'];
        }
        
        isArticleEntered=1;
    }else if( mcCode !=undefined && mcCode.length>0 ){
        if (IsInitiationFlag=="1"){
            if(mstPromoID==undefined){
                return [false,'Please select request.'];
            }else if(mstPromoID==null){
                return [false,'Please select request.'];
            }else if(mstPromoID.length==0){
                return [false,'Please select request.'];
            }

        }else{
            mstPromoID="0";
        }
        if(!isNumeric(mcCode)){
            if(txtMCCodeId!=undefined || txtMCCodeId.length>0){
                $("#"+txtMCCodeId).focus();
                $("#"+txtMCCodeId).val("");
            }
            return [false,'MC code should be numeric.'];
        }else if(mcCode.length > 18){
            if(txtMCCodeId!=undefined || txtMCCodeId.length>0){
                $("#"+txtMCCodeId).focus();
                $("#"+txtMCCodeId).val("");
            }
            return [false,'MC code should not be greater than 18 Characters.'];
        }
        if(!isNumeric(rebateRate)){
            if(txtRebateRate!=undefined && txtRebateRate.length>0){
                $("#"+txtRebateRate).focus();
                $("#"+txtRebateRate).val("");
            }
            if(txtCategoryName!=undefined)
            {
                return [false,'Rebate Rate should be numeric.'];
            }
        }
        if(!isIntegerOrNull(settlementPartner)){
            if(txtSettlementPartner!=undefined && txtSettlementPartner.length>0){
                $("#"+txtSettlementPartner).focus();
                $("#"+txtSettlementPartner).val("");
            }
            if(txtSettlementPartner!=undefined)
            {
                return [false,'Settlement Partner should be numeric.'];
            }
        }
        if(!checkFixedLength(settlementPartner,'Settlement Partner',6,10)){
            if(txtSettlementPartner!=undefined && txtSettlementPartner.length>0){
                $("#"+txtSettlementPartner).focus();
                $("#"+txtSettlementPartner).val("");
            }
            if(txtSettlementPartner!=undefined)
            {
                return [false,'Settlement Partner length should be between 6 and 10'];
            }
        }
        if(!isAlphabetic(CategoryName,'Category Person Name')){
            if(txtCategoryName!=undefined && txtCategoryName.length>0){
                $("#"+txtCategoryName).focus();
                $("#"+txtCategoryName).val("");
            }
            if(txtCategoryName!=undefined)
            {
                return [false,'Category Person Name is not valid'];
            }
        }
        if(!checkLength(CategoryName,'Category Person Name',50)){
            if(txtCategoryName!=undefined && txtCategoryName.length>0){
                $("#"+txtCategoryName).focus();
                $("#"+txtCategoryName).val("");
            }
            if(txtCategoryName!=undefined)
            {
                return [false,'Category Person Name should not be more than 50 characters'];
            }
        }
        
        isArticleEntered=0;
    }
    var successFlag=true;
    var successMsg="";
    $.ajax({
        url: "validateArticleORMCCode?isArticleEntered="+isArticleEntered+"&mcCode="+mcCode+"&articleCode="+articleCode+"&mstPromoId="+mstPromoID+"&IsInitiationFlag="+IsInitiationFlag,
        global: false,
        type: "POST",
        dataType: "json",
        contanttype: 'text/json',
        async:false,
        cache:false,
        success:
        function(data){
            if(data.respCode=="0"){
                if(txtArticleNoId!=undefined || txtArticleNoId.length>0){
                    $("#"+txtArticleNoId).focus();
                    $("#"+txtArticleNoId).val('');
                }
                //                $("#btnAddArticle").attr("disabled", true);
                //                $("#btnValidateArticle").attr("disabled", false);
                successFlag=false;
                successMsg=data.respMsg;
            }else{
                if(txtArticleNoId!=undefined || txtArticleNoId.length>0){
                    $("#"+txtArticleNoId).val(data.articleCode);
                    $("#"+txtArticleNoId).attr("disabled", true);
                }
                if(txtArticleDescId!=undefined || txtArticleDescId.length>0){
                    $("#"+txtArticleDescId).val(data.articleDesc);
                    $("#"+txtArticleDescId).attr("disabled", true);
                }
                if(txtMCCodeId!=undefined || txtMCCodeId.length>0){
                    $("#"+txtMCCodeId).val(data.mcCode);
                    $("#"+txtMCCodeId).attr("disabled", true);
                }

                if(txtMCDescId!=undefined || txtMCDescId.length>0){
                    $("#"+txtMCDescId).val(data.mcDesc);
                    $("#"+txtMCDescId).attr("disabled", true);
                }
                //                $("#btnAddArticle").attr("disabled", false);
                //                $("#btnValidateArticle").attr("disabled", true);
                
                if(txtBrandCodeId!=undefined || txtBrandCodeId.length>0){
                    $("#"+txtBrandCodeId).val(data.brandCode);
                    $("#"+txtBrandCodeId).attr("disabled", true);
                }

                if(txtBrandDescId!=undefined || txtBrandDescId.length>0){
                    $("#"+txtBrandDescId).val(data.brandDesc);
                    $("#"+txtBrandDescId).attr("disabled", true);
                }
                //alert(rebateRate);
                if(txtDeptName!=undefined || txtDeptName.length>0){
                    $("#"+txtDeptName).val(data.deptName);
                    $("#"+txtDeptName).attr("disabled", true);
                }
                if(txtRebateRate!=undefined || txtRebateRate.length>0){
                    if(rebateRate!=="")
                    {
                        $("#"+txtRebateRate).val(round(rebateRate,2));
                        $("#"+txtRebateRate).attr("disabled", true);
                    }
                    else
                    {
                        $("#"+txtRebateRate).val("-");
                        $("#"+txtRebateRate).attr("disabled", true);
                    }
                }
                if(txtSettlementPartner!=undefined || txtSettlementPartner.length>0){
                    
                    if(settlementPartner!=="")
                    {
                        $("#"+txtSettlementPartner).val(settlementPartner);
                        $("#"+txtSettlementPartner).attr("disabled", true);
                    }    
                    else
                    {
                        $("#"+txtSettlementPartner).val("-");
                        $("#"+txtSettlementPartner).attr("disabled", true);
                    }
                }
                if(txtCategoryName!=undefined || txtCategoryName.length>0)
                {
                    if(CategoryName!=="")
                    {
                        $("#"+txtCategoryName).val(CategoryName);
                        $("#"+txtCategoryName).attr("disabled", true);
                    }
                    else
                    {
                        $("#"+txtCategoryName).val("-");
                        $("#"+txtCategoryName).attr("disabled", true);
                    }
                } 
                
                
                successFlag=true;
                successMsg="";
            }
        }
    });
    return[successFlag,successMsg];
}





