package com.cafe.inn.cafemanagementsystem.restimpl;

import com.cafe.inn.cafemanagementsystem.constants.CafeConstants;
import com.cafe.inn.cafemanagementsystem.rest.BillRest;
import com.cafe.inn.cafemanagementsystem.service.BillService;
import com.cafe.inn.cafemanagementsystem.utils.CafeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@RestController
public class BillRestImpl implements BillRest {

    @Autowired
    private BillService billService;

    @Override
    public ResponseEntity<String> generateReport(Map<String, Object> requestMap) {
        try {
            return billService.generateReport(requestMap);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
