/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nfdil.pwm.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.nfdil.pwm.common.constants.WebConstants;
import com.nfdil.pwm.common.enums.PropertyEnum;



public class PromotionPropertyUtil
{

    private static Properties pro = new Properties();

    static
    {
        InputStream is = null;
        try
        {
            is = PromotionPropertyUtil.class.getResourceAsStream(WebConstants.PROPERTY);
            pro.load(is);
        } catch (IOException e) {
			e.printStackTrace();
		}  finally
        {
            if (is != null)
            {
                try
                {
                    is.close();
                } catch (IOException ex)
                {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static String getPropertyString(PropertyEnum proEnum) throws IOException
    {

        String str_property = null;
        switch (proEnum)
        {
            case PROPOSAL_ARTICLE_FILE_PATH:
                str_property = pro.getProperty("proposalArticleFilePath");
                break;
            case PROPOSAL_OTHER_FILE_PATH:
                str_property = pro.getProperty("proposalOtherFilePath");
                break;
            case COMMON_DIRECTORY_PATH:
                str_property = pro.getProperty("commondirectorypath");
                break;
            case INITIATE_ARTICLE_FILE_PATH:
                str_property = pro.getProperty("initiateArticleFilePath");
                break;
            case TASK_FILE_PATH:
                str_property = pro.getProperty("taskFilePath");
                break;
            case SUB_PROMOTION_FILE_PATH:
                str_property = pro.getProperty("subPromoRequestFile");
                break;
            case LSMW_FILE:
                str_property = pro.getProperty("lsmwFilePath");
                break;
            case SUB_PROMOTION_TEMPLATE_FILE_PATH:
                str_property = pro.getProperty("SubPromoTemplateFile");
                break;
            case PROMO_CLOSE:
                str_property = pro.getProperty("PromoClosePath");
                break;
            case SAP_WEB_UI:
                str_property = pro.getProperty("sapWebUI");
                break;
            case SITE_UPLOAD_TEMPLATE_FILE_PATH:
                str_property = pro.getProperty("siteUploadTemplateFile");
                break;
            //Added By Ruchi Kansara #CR16
            case CHANGE_DATE_FILE_PATH:
                str_property = pro.getProperty("changeDateTemplateFile");
                break;
            case CHANGE_MC_ARTICLE_PATH:
                str_property = pro.getProperty("changeMCArticleTemplateFile");
                break;
            case CHANGE_STORE_DETAIL_PATH:
                str_property = pro.getProperty("changeStoreTemplateFile");
                break;
            case MC_WISE_LEAD_TIME_PATH:
                str_property = pro.getProperty("MCWiseLeadtimeTemplateFile");
                break;
            case INTEGRATED_TIC_REQ_NO:
                str_property = pro.getProperty("IntegratedReportTicketRequest");
                break;
            case INTEGRATED_PROMO_STORE:
                str_property = pro.getProperty("IntegratedReportPromoStore");
                break;
            case INTEGRATED_MC_DETAILS:
                str_property = pro.getProperty("IntegratedReportMcDetails");
                break;
            case INTEGRATED_ARTICLE_DETAILS:
                str_property = pro.getProperty("IntegratedReportArticleDetails");
                break;
            case LSMW_SITE_UPLOAD_TEMPLATE_FILE_PATH:
                str_property = pro.getProperty("LsmwSiteGroupUpdateTemplateFile");
                break;
            case CHANGE_LSMW_SITE_UPLOAD_FILE_PATH:
                str_property = pro.getProperty("changeLsmwStoreTemplateFile");
                break;
            case VISTEX_MASTER_UPLOAD_TEMPLATE_FILE_PATH:
                str_property = pro.getProperty("VistexMasterUploadTemplateFile");
                break;
            case VISTEX_MASTER_TEMPLATE_SAMPLE_FILE_PATH:
                str_property = pro.getProperty("VistexMasterTemplateSampleFile");
                break;
            case DUPLICATE_REQUEST_FILE:
                str_property = pro.getProperty("DuplicateRequestFiles");
                break;
            //Added By Marichi Patel For PWM - 361 -- Start
            case TRANS_PROMO_MODIFICATION_UPLOAD_FILE_PATH:
                str_property = pro.getProperty("TransPromoModificationUploadFilePath");
                break;
            //Added By Marichi Patel For PWM - 361 -- End
                // Added By Dhaval Promotion Modification.
            case MODIFY_CHANGE_DATE_FILE_PATH:
                str_property = pro.getProperty("modifyChangeDateTemplateFile");
                break;
            case MODIFY_ADD_MC_ARTICLE_PATH:
                str_property = pro.getProperty("modifyChangeMCArticleTemplateFile");
                break;
            case MODIFY_REMOVE_MC_ARTICLE_PATH:
                str_property = pro.getProperty("modifyRemoveMCArticleTemplateFile");
                break;
            //Added By Marichi For PWM 698 -- Start                
            case PROMO_INVISIBLE:
                str_property = pro.getProperty("PromoInvisiblePath");
                break;
            case PROMO_INVISIBLE_TEMPLATE:
                str_property = pro.getProperty("PromoInvisibleTemplatePath");
                break;
            //Added By Marichi For PWM 698 -- End 
        }
        return str_property;
    }
}
