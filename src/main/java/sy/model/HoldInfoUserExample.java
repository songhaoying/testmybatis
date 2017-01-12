package sy.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HoldInfoUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HoldInfoUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserNoIsNull() {
            addCriterion("USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNotNull() {
            addCriterion("USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoEqualTo(String value) {
            addCriterion("USER_NO =", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotEqualTo(String value) {
            addCriterion("USER_NO <>", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThan(String value) {
            addCriterion("USER_NO >", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NO >=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThan(String value) {
            addCriterion("USER_NO <", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThanOrEqualTo(String value) {
            addCriterion("USER_NO <=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLike(String value) {
            addCriterion("USER_NO like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotLike(String value) {
            addCriterion("USER_NO not like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoIn(List<String> values) {
            addCriterion("USER_NO in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotIn(List<String> values) {
            addCriterion("USER_NO not in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoBetween(String value1, String value2) {
            addCriterion("USER_NO between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotBetween(String value1, String value2) {
            addCriterion("USER_NO not between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberIsNull() {
            addCriterion("DEVICE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberIsNotNull() {
            addCriterion("DEVICE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberEqualTo(String value) {
            addCriterion("DEVICE_NUMBER =", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberNotEqualTo(String value) {
            addCriterion("DEVICE_NUMBER <>", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberGreaterThan(String value) {
            addCriterion("DEVICE_NUMBER >", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_NUMBER >=", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberLessThan(String value) {
            addCriterion("DEVICE_NUMBER <", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_NUMBER <=", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberLike(String value) {
            addCriterion("DEVICE_NUMBER like", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberNotLike(String value) {
            addCriterion("DEVICE_NUMBER not like", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberIn(List<String> values) {
            addCriterion("DEVICE_NUMBER in", values, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberNotIn(List<String> values) {
            addCriterion("DEVICE_NUMBER not in", values, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberBetween(String value1, String value2) {
            addCriterion("DEVICE_NUMBER between", value1, value2, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberNotBetween(String value1, String value2) {
            addCriterion("DEVICE_NUMBER not between", value1, value2, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNoIsNull() {
            addCriterion("CUSTOMER_NO is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNoIsNotNull() {
            addCriterion("CUSTOMER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNoEqualTo(String value) {
            addCriterion("CUSTOMER_NO =", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotEqualTo(String value) {
            addCriterion("CUSTOMER_NO <>", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoGreaterThan(String value) {
            addCriterion("CUSTOMER_NO >", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NO >=", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLessThan(String value) {
            addCriterion("CUSTOMER_NO <", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NO <=", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLike(String value) {
            addCriterion("CUSTOMER_NO like", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotLike(String value) {
            addCriterion("CUSTOMER_NO not like", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoIn(List<String> values) {
            addCriterion("CUSTOMER_NO in", values, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotIn(List<String> values) {
            addCriterion("CUSTOMER_NO not in", values, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NO between", value1, value2, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NO not between", value1, value2, "customerNo");
            return (Criteria) this;
        }

        public Criteria andSvcIdIsNull() {
            addCriterion("SVC_ID is null");
            return (Criteria) this;
        }

        public Criteria andSvcIdIsNotNull() {
            addCriterion("SVC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSvcIdEqualTo(String value) {
            addCriterion("SVC_ID =", value, "svcId");
            return (Criteria) this;
        }

        public Criteria andSvcIdNotEqualTo(String value) {
            addCriterion("SVC_ID <>", value, "svcId");
            return (Criteria) this;
        }

        public Criteria andSvcIdGreaterThan(String value) {
            addCriterion("SVC_ID >", value, "svcId");
            return (Criteria) this;
        }

        public Criteria andSvcIdGreaterThanOrEqualTo(String value) {
            addCriterion("SVC_ID >=", value, "svcId");
            return (Criteria) this;
        }

        public Criteria andSvcIdLessThan(String value) {
            addCriterion("SVC_ID <", value, "svcId");
            return (Criteria) this;
        }

        public Criteria andSvcIdLessThanOrEqualTo(String value) {
            addCriterion("SVC_ID <=", value, "svcId");
            return (Criteria) this;
        }

        public Criteria andSvcIdLike(String value) {
            addCriterion("SVC_ID like", value, "svcId");
            return (Criteria) this;
        }

        public Criteria andSvcIdNotLike(String value) {
            addCriterion("SVC_ID not like", value, "svcId");
            return (Criteria) this;
        }

        public Criteria andSvcIdIn(List<String> values) {
            addCriterion("SVC_ID in", values, "svcId");
            return (Criteria) this;
        }

        public Criteria andSvcIdNotIn(List<String> values) {
            addCriterion("SVC_ID not in", values, "svcId");
            return (Criteria) this;
        }

        public Criteria andSvcIdBetween(String value1, String value2) {
            addCriterion("SVC_ID between", value1, value2, "svcId");
            return (Criteria) this;
        }

        public Criteria andSvcIdNotBetween(String value1, String value2) {
            addCriterion("SVC_ID not between", value1, value2, "svcId");
            return (Criteria) this;
        }

        public Criteria andSvcDescIsNull() {
            addCriterion("SVC_DESC is null");
            return (Criteria) this;
        }

        public Criteria andSvcDescIsNotNull() {
            addCriterion("SVC_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andSvcDescEqualTo(String value) {
            addCriterion("SVC_DESC =", value, "svcDesc");
            return (Criteria) this;
        }

        public Criteria andSvcDescNotEqualTo(String value) {
            addCriterion("SVC_DESC <>", value, "svcDesc");
            return (Criteria) this;
        }

        public Criteria andSvcDescGreaterThan(String value) {
            addCriterion("SVC_DESC >", value, "svcDesc");
            return (Criteria) this;
        }

        public Criteria andSvcDescGreaterThanOrEqualTo(String value) {
            addCriterion("SVC_DESC >=", value, "svcDesc");
            return (Criteria) this;
        }

        public Criteria andSvcDescLessThan(String value) {
            addCriterion("SVC_DESC <", value, "svcDesc");
            return (Criteria) this;
        }

        public Criteria andSvcDescLessThanOrEqualTo(String value) {
            addCriterion("SVC_DESC <=", value, "svcDesc");
            return (Criteria) this;
        }

        public Criteria andSvcDescLike(String value) {
            addCriterion("SVC_DESC like", value, "svcDesc");
            return (Criteria) this;
        }

        public Criteria andSvcDescNotLike(String value) {
            addCriterion("SVC_DESC not like", value, "svcDesc");
            return (Criteria) this;
        }

        public Criteria andSvcDescIn(List<String> values) {
            addCriterion("SVC_DESC in", values, "svcDesc");
            return (Criteria) this;
        }

        public Criteria andSvcDescNotIn(List<String> values) {
            addCriterion("SVC_DESC not in", values, "svcDesc");
            return (Criteria) this;
        }

        public Criteria andSvcDescBetween(String value1, String value2) {
            addCriterion("SVC_DESC between", value1, value2, "svcDesc");
            return (Criteria) this;
        }

        public Criteria andSvcDescNotBetween(String value1, String value2) {
            addCriterion("SVC_DESC not between", value1, value2, "svcDesc");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(String value) {
            addCriterion("AREA_ID =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(String value) {
            addCriterion("AREA_ID <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(String value) {
            addCriterion("AREA_ID >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_ID >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(String value) {
            addCriterion("AREA_ID <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(String value) {
            addCriterion("AREA_ID <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLike(String value) {
            addCriterion("AREA_ID like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotLike(String value) {
            addCriterion("AREA_ID not like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<String> values) {
            addCriterion("AREA_ID in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<String> values) {
            addCriterion("AREA_ID not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(String value1, String value2) {
            addCriterion("AREA_ID between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(String value1, String value2) {
            addCriterion("AREA_ID not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("CITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("CITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(String value) {
            addCriterion("CITY_ID =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(String value) {
            addCriterion("CITY_ID <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(String value) {
            addCriterion("CITY_ID >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_ID >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(String value) {
            addCriterion("CITY_ID <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(String value) {
            addCriterion("CITY_ID <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLike(String value) {
            addCriterion("CITY_ID like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotLike(String value) {
            addCriterion("CITY_ID not like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<String> values) {
            addCriterion("CITY_ID in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<String> values) {
            addCriterion("CITY_ID not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(String value1, String value2) {
            addCriterion("CITY_ID between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(String value1, String value2) {
            addCriterion("CITY_ID not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andAreaDescIsNull() {
            addCriterion("AREA_DESC is null");
            return (Criteria) this;
        }

        public Criteria andAreaDescIsNotNull() {
            addCriterion("AREA_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andAreaDescEqualTo(String value) {
            addCriterion("AREA_DESC =", value, "areaDesc");
            return (Criteria) this;
        }

        public Criteria andAreaDescNotEqualTo(String value) {
            addCriterion("AREA_DESC <>", value, "areaDesc");
            return (Criteria) this;
        }

        public Criteria andAreaDescGreaterThan(String value) {
            addCriterion("AREA_DESC >", value, "areaDesc");
            return (Criteria) this;
        }

        public Criteria andAreaDescGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_DESC >=", value, "areaDesc");
            return (Criteria) this;
        }

        public Criteria andAreaDescLessThan(String value) {
            addCriterion("AREA_DESC <", value, "areaDesc");
            return (Criteria) this;
        }

        public Criteria andAreaDescLessThanOrEqualTo(String value) {
            addCriterion("AREA_DESC <=", value, "areaDesc");
            return (Criteria) this;
        }

        public Criteria andAreaDescLike(String value) {
            addCriterion("AREA_DESC like", value, "areaDesc");
            return (Criteria) this;
        }

        public Criteria andAreaDescNotLike(String value) {
            addCriterion("AREA_DESC not like", value, "areaDesc");
            return (Criteria) this;
        }

        public Criteria andAreaDescIn(List<String> values) {
            addCriterion("AREA_DESC in", values, "areaDesc");
            return (Criteria) this;
        }

        public Criteria andAreaDescNotIn(List<String> values) {
            addCriterion("AREA_DESC not in", values, "areaDesc");
            return (Criteria) this;
        }

        public Criteria andAreaDescBetween(String value1, String value2) {
            addCriterion("AREA_DESC between", value1, value2, "areaDesc");
            return (Criteria) this;
        }

        public Criteria andAreaDescNotBetween(String value1, String value2) {
            addCriterion("AREA_DESC not between", value1, value2, "areaDesc");
            return (Criteria) this;
        }

        public Criteria andCityDescIsNull() {
            addCriterion("CITY_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCityDescIsNotNull() {
            addCriterion("CITY_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCityDescEqualTo(String value) {
            addCriterion("CITY_DESC =", value, "cityDesc");
            return (Criteria) this;
        }

        public Criteria andCityDescNotEqualTo(String value) {
            addCriterion("CITY_DESC <>", value, "cityDesc");
            return (Criteria) this;
        }

        public Criteria andCityDescGreaterThan(String value) {
            addCriterion("CITY_DESC >", value, "cityDesc");
            return (Criteria) this;
        }

        public Criteria andCityDescGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_DESC >=", value, "cityDesc");
            return (Criteria) this;
        }

        public Criteria andCityDescLessThan(String value) {
            addCriterion("CITY_DESC <", value, "cityDesc");
            return (Criteria) this;
        }

        public Criteria andCityDescLessThanOrEqualTo(String value) {
            addCriterion("CITY_DESC <=", value, "cityDesc");
            return (Criteria) this;
        }

        public Criteria andCityDescLike(String value) {
            addCriterion("CITY_DESC like", value, "cityDesc");
            return (Criteria) this;
        }

        public Criteria andCityDescNotLike(String value) {
            addCriterion("CITY_DESC not like", value, "cityDesc");
            return (Criteria) this;
        }

        public Criteria andCityDescIn(List<String> values) {
            addCriterion("CITY_DESC in", values, "cityDesc");
            return (Criteria) this;
        }

        public Criteria andCityDescNotIn(List<String> values) {
            addCriterion("CITY_DESC not in", values, "cityDesc");
            return (Criteria) this;
        }

        public Criteria andCityDescBetween(String value1, String value2) {
            addCriterion("CITY_DESC between", value1, value2, "cityDesc");
            return (Criteria) this;
        }

        public Criteria andCityDescNotBetween(String value1, String value2) {
            addCriterion("CITY_DESC not between", value1, value2, "cityDesc");
            return (Criteria) this;
        }

        public Criteria andBrandTypeIsNull() {
            addCriterion("BRAND_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBrandTypeIsNotNull() {
            addCriterion("BRAND_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBrandTypeEqualTo(String value) {
            addCriterion("BRAND_TYPE =", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeNotEqualTo(String value) {
            addCriterion("BRAND_TYPE <>", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeGreaterThan(String value) {
            addCriterion("BRAND_TYPE >", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BRAND_TYPE >=", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeLessThan(String value) {
            addCriterion("BRAND_TYPE <", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeLessThanOrEqualTo(String value) {
            addCriterion("BRAND_TYPE <=", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeLike(String value) {
            addCriterion("BRAND_TYPE like", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeNotLike(String value) {
            addCriterion("BRAND_TYPE not like", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeIn(List<String> values) {
            addCriterion("BRAND_TYPE in", values, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeNotIn(List<String> values) {
            addCriterion("BRAND_TYPE not in", values, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeBetween(String value1, String value2) {
            addCriterion("BRAND_TYPE between", value1, value2, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeNotBetween(String value1, String value2) {
            addCriterion("BRAND_TYPE not between", value1, value2, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandDescIsNull() {
            addCriterion("BRAND_DESC is null");
            return (Criteria) this;
        }

        public Criteria andBrandDescIsNotNull() {
            addCriterion("BRAND_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andBrandDescEqualTo(String value) {
            addCriterion("BRAND_DESC =", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescNotEqualTo(String value) {
            addCriterion("BRAND_DESC <>", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescGreaterThan(String value) {
            addCriterion("BRAND_DESC >", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescGreaterThanOrEqualTo(String value) {
            addCriterion("BRAND_DESC >=", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescLessThan(String value) {
            addCriterion("BRAND_DESC <", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescLessThanOrEqualTo(String value) {
            addCriterion("BRAND_DESC <=", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescLike(String value) {
            addCriterion("BRAND_DESC like", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescNotLike(String value) {
            addCriterion("BRAND_DESC not like", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescIn(List<String> values) {
            addCriterion("BRAND_DESC in", values, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescNotIn(List<String> values) {
            addCriterion("BRAND_DESC not in", values, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescBetween(String value1, String value2) {
            addCriterion("BRAND_DESC between", value1, value2, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescNotBetween(String value1, String value2) {
            addCriterion("BRAND_DESC not between", value1, value2, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andInnetTypeCodeIsNull() {
            addCriterion("INNET_TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andInnetTypeCodeIsNotNull() {
            addCriterion("INNET_TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andInnetTypeCodeEqualTo(String value) {
            addCriterion("INNET_TYPE_CODE =", value, "innetTypeCode");
            return (Criteria) this;
        }

        public Criteria andInnetTypeCodeNotEqualTo(String value) {
            addCriterion("INNET_TYPE_CODE <>", value, "innetTypeCode");
            return (Criteria) this;
        }

        public Criteria andInnetTypeCodeGreaterThan(String value) {
            addCriterion("INNET_TYPE_CODE >", value, "innetTypeCode");
            return (Criteria) this;
        }

        public Criteria andInnetTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INNET_TYPE_CODE >=", value, "innetTypeCode");
            return (Criteria) this;
        }

        public Criteria andInnetTypeCodeLessThan(String value) {
            addCriterion("INNET_TYPE_CODE <", value, "innetTypeCode");
            return (Criteria) this;
        }

        public Criteria andInnetTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("INNET_TYPE_CODE <=", value, "innetTypeCode");
            return (Criteria) this;
        }

        public Criteria andInnetTypeCodeLike(String value) {
            addCriterion("INNET_TYPE_CODE like", value, "innetTypeCode");
            return (Criteria) this;
        }

        public Criteria andInnetTypeCodeNotLike(String value) {
            addCriterion("INNET_TYPE_CODE not like", value, "innetTypeCode");
            return (Criteria) this;
        }

        public Criteria andInnetTypeCodeIn(List<String> values) {
            addCriterion("INNET_TYPE_CODE in", values, "innetTypeCode");
            return (Criteria) this;
        }

        public Criteria andInnetTypeCodeNotIn(List<String> values) {
            addCriterion("INNET_TYPE_CODE not in", values, "innetTypeCode");
            return (Criteria) this;
        }

        public Criteria andInnetTypeCodeBetween(String value1, String value2) {
            addCriterion("INNET_TYPE_CODE between", value1, value2, "innetTypeCode");
            return (Criteria) this;
        }

        public Criteria andInnetTypeCodeNotBetween(String value1, String value2) {
            addCriterion("INNET_TYPE_CODE not between", value1, value2, "innetTypeCode");
            return (Criteria) this;
        }

        public Criteria andInnetTypeIsNull() {
            addCriterion("INNET_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInnetTypeIsNotNull() {
            addCriterion("INNET_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInnetTypeEqualTo(String value) {
            addCriterion("INNET_TYPE =", value, "innetType");
            return (Criteria) this;
        }

        public Criteria andInnetTypeNotEqualTo(String value) {
            addCriterion("INNET_TYPE <>", value, "innetType");
            return (Criteria) this;
        }

        public Criteria andInnetTypeGreaterThan(String value) {
            addCriterion("INNET_TYPE >", value, "innetType");
            return (Criteria) this;
        }

        public Criteria andInnetTypeGreaterThanOrEqualTo(String value) {
            addCriterion("INNET_TYPE >=", value, "innetType");
            return (Criteria) this;
        }

        public Criteria andInnetTypeLessThan(String value) {
            addCriterion("INNET_TYPE <", value, "innetType");
            return (Criteria) this;
        }

        public Criteria andInnetTypeLessThanOrEqualTo(String value) {
            addCriterion("INNET_TYPE <=", value, "innetType");
            return (Criteria) this;
        }

        public Criteria andInnetTypeLike(String value) {
            addCriterion("INNET_TYPE like", value, "innetType");
            return (Criteria) this;
        }

        public Criteria andInnetTypeNotLike(String value) {
            addCriterion("INNET_TYPE not like", value, "innetType");
            return (Criteria) this;
        }

        public Criteria andInnetTypeIn(List<String> values) {
            addCriterion("INNET_TYPE in", values, "innetType");
            return (Criteria) this;
        }

        public Criteria andInnetTypeNotIn(List<String> values) {
            addCriterion("INNET_TYPE not in", values, "innetType");
            return (Criteria) this;
        }

        public Criteria andInnetTypeBetween(String value1, String value2) {
            addCriterion("INNET_TYPE between", value1, value2, "innetType");
            return (Criteria) this;
        }

        public Criteria andInnetTypeNotBetween(String value1, String value2) {
            addCriterion("INNET_TYPE not between", value1, value2, "innetType");
            return (Criteria) this;
        }

        public Criteria andInnetTypeDescIsNull() {
            addCriterion("INNET_TYPE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andInnetTypeDescIsNotNull() {
            addCriterion("INNET_TYPE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andInnetTypeDescEqualTo(String value) {
            addCriterion("INNET_TYPE_DESC =", value, "innetTypeDesc");
            return (Criteria) this;
        }

        public Criteria andInnetTypeDescNotEqualTo(String value) {
            addCriterion("INNET_TYPE_DESC <>", value, "innetTypeDesc");
            return (Criteria) this;
        }

        public Criteria andInnetTypeDescGreaterThan(String value) {
            addCriterion("INNET_TYPE_DESC >", value, "innetTypeDesc");
            return (Criteria) this;
        }

        public Criteria andInnetTypeDescGreaterThanOrEqualTo(String value) {
            addCriterion("INNET_TYPE_DESC >=", value, "innetTypeDesc");
            return (Criteria) this;
        }

        public Criteria andInnetTypeDescLessThan(String value) {
            addCriterion("INNET_TYPE_DESC <", value, "innetTypeDesc");
            return (Criteria) this;
        }

        public Criteria andInnetTypeDescLessThanOrEqualTo(String value) {
            addCriterion("INNET_TYPE_DESC <=", value, "innetTypeDesc");
            return (Criteria) this;
        }

        public Criteria andInnetTypeDescLike(String value) {
            addCriterion("INNET_TYPE_DESC like", value, "innetTypeDesc");
            return (Criteria) this;
        }

        public Criteria andInnetTypeDescNotLike(String value) {
            addCriterion("INNET_TYPE_DESC not like", value, "innetTypeDesc");
            return (Criteria) this;
        }

        public Criteria andInnetTypeDescIn(List<String> values) {
            addCriterion("INNET_TYPE_DESC in", values, "innetTypeDesc");
            return (Criteria) this;
        }

        public Criteria andInnetTypeDescNotIn(List<String> values) {
            addCriterion("INNET_TYPE_DESC not in", values, "innetTypeDesc");
            return (Criteria) this;
        }

        public Criteria andInnetTypeDescBetween(String value1, String value2) {
            addCriterion("INNET_TYPE_DESC between", value1, value2, "innetTypeDesc");
            return (Criteria) this;
        }

        public Criteria andInnetTypeDescNotBetween(String value1, String value2) {
            addCriterion("INNET_TYPE_DESC not between", value1, value2, "innetTypeDesc");
            return (Criteria) this;
        }

        public Criteria andSaleTypeCodeIsNull() {
            addCriterion("SALE_TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSaleTypeCodeIsNotNull() {
            addCriterion("SALE_TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTypeCodeEqualTo(String value) {
            addCriterion("SALE_TYPE_CODE =", value, "saleTypeCode");
            return (Criteria) this;
        }

        public Criteria andSaleTypeCodeNotEqualTo(String value) {
            addCriterion("SALE_TYPE_CODE <>", value, "saleTypeCode");
            return (Criteria) this;
        }

        public Criteria andSaleTypeCodeGreaterThan(String value) {
            addCriterion("SALE_TYPE_CODE >", value, "saleTypeCode");
            return (Criteria) this;
        }

        public Criteria andSaleTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_TYPE_CODE >=", value, "saleTypeCode");
            return (Criteria) this;
        }

        public Criteria andSaleTypeCodeLessThan(String value) {
            addCriterion("SALE_TYPE_CODE <", value, "saleTypeCode");
            return (Criteria) this;
        }

        public Criteria andSaleTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("SALE_TYPE_CODE <=", value, "saleTypeCode");
            return (Criteria) this;
        }

        public Criteria andSaleTypeCodeLike(String value) {
            addCriterion("SALE_TYPE_CODE like", value, "saleTypeCode");
            return (Criteria) this;
        }

        public Criteria andSaleTypeCodeNotLike(String value) {
            addCriterion("SALE_TYPE_CODE not like", value, "saleTypeCode");
            return (Criteria) this;
        }

        public Criteria andSaleTypeCodeIn(List<String> values) {
            addCriterion("SALE_TYPE_CODE in", values, "saleTypeCode");
            return (Criteria) this;
        }

        public Criteria andSaleTypeCodeNotIn(List<String> values) {
            addCriterion("SALE_TYPE_CODE not in", values, "saleTypeCode");
            return (Criteria) this;
        }

        public Criteria andSaleTypeCodeBetween(String value1, String value2) {
            addCriterion("SALE_TYPE_CODE between", value1, value2, "saleTypeCode");
            return (Criteria) this;
        }

        public Criteria andSaleTypeCodeNotBetween(String value1, String value2) {
            addCriterion("SALE_TYPE_CODE not between", value1, value2, "saleTypeCode");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIsNull() {
            addCriterion("SALE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIsNotNull() {
            addCriterion("SALE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTypeEqualTo(String value) {
            addCriterion("SALE_TYPE =", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotEqualTo(String value) {
            addCriterion("SALE_TYPE <>", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeGreaterThan(String value) {
            addCriterion("SALE_TYPE >", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_TYPE >=", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeLessThan(String value) {
            addCriterion("SALE_TYPE <", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeLessThanOrEqualTo(String value) {
            addCriterion("SALE_TYPE <=", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeLike(String value) {
            addCriterion("SALE_TYPE like", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotLike(String value) {
            addCriterion("SALE_TYPE not like", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIn(List<String> values) {
            addCriterion("SALE_TYPE in", values, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotIn(List<String> values) {
            addCriterion("SALE_TYPE not in", values, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeBetween(String value1, String value2) {
            addCriterion("SALE_TYPE between", value1, value2, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotBetween(String value1, String value2) {
            addCriterion("SALE_TYPE not between", value1, value2, "saleType");
            return (Criteria) this;
        }

        public Criteria andAssureNoIsNull() {
            addCriterion("ASSURE_NO is null");
            return (Criteria) this;
        }

        public Criteria andAssureNoIsNotNull() {
            addCriterion("ASSURE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAssureNoEqualTo(String value) {
            addCriterion("ASSURE_NO =", value, "assureNo");
            return (Criteria) this;
        }

        public Criteria andAssureNoNotEqualTo(String value) {
            addCriterion("ASSURE_NO <>", value, "assureNo");
            return (Criteria) this;
        }

        public Criteria andAssureNoGreaterThan(String value) {
            addCriterion("ASSURE_NO >", value, "assureNo");
            return (Criteria) this;
        }

        public Criteria andAssureNoGreaterThanOrEqualTo(String value) {
            addCriterion("ASSURE_NO >=", value, "assureNo");
            return (Criteria) this;
        }

        public Criteria andAssureNoLessThan(String value) {
            addCriterion("ASSURE_NO <", value, "assureNo");
            return (Criteria) this;
        }

        public Criteria andAssureNoLessThanOrEqualTo(String value) {
            addCriterion("ASSURE_NO <=", value, "assureNo");
            return (Criteria) this;
        }

        public Criteria andAssureNoLike(String value) {
            addCriterion("ASSURE_NO like", value, "assureNo");
            return (Criteria) this;
        }

        public Criteria andAssureNoNotLike(String value) {
            addCriterion("ASSURE_NO not like", value, "assureNo");
            return (Criteria) this;
        }

        public Criteria andAssureNoIn(List<String> values) {
            addCriterion("ASSURE_NO in", values, "assureNo");
            return (Criteria) this;
        }

        public Criteria andAssureNoNotIn(List<String> values) {
            addCriterion("ASSURE_NO not in", values, "assureNo");
            return (Criteria) this;
        }

        public Criteria andAssureNoBetween(String value1, String value2) {
            addCriterion("ASSURE_NO between", value1, value2, "assureNo");
            return (Criteria) this;
        }

        public Criteria andAssureNoNotBetween(String value1, String value2) {
            addCriterion("ASSURE_NO not between", value1, value2, "assureNo");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeIsNull() {
            addCriterion("PAY_TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeIsNotNull() {
            addCriterion("PAY_TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeEqualTo(String value) {
            addCriterion("PAY_TYPE_CODE =", value, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeNotEqualTo(String value) {
            addCriterion("PAY_TYPE_CODE <>", value, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeGreaterThan(String value) {
            addCriterion("PAY_TYPE_CODE >", value, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_TYPE_CODE >=", value, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeLessThan(String value) {
            addCriterion("PAY_TYPE_CODE <", value, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("PAY_TYPE_CODE <=", value, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeLike(String value) {
            addCriterion("PAY_TYPE_CODE like", value, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeNotLike(String value) {
            addCriterion("PAY_TYPE_CODE not like", value, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeIn(List<String> values) {
            addCriterion("PAY_TYPE_CODE in", values, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeNotIn(List<String> values) {
            addCriterion("PAY_TYPE_CODE not in", values, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeBetween(String value1, String value2) {
            addCriterion("PAY_TYPE_CODE between", value1, value2, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeCodeNotBetween(String value1, String value2) {
            addCriterion("PAY_TYPE_CODE not between", value1, value2, "payTypeCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("PAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("PAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("PAY_TYPE =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("PAY_TYPE <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("PAY_TYPE >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_TYPE >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("PAY_TYPE <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("PAY_TYPE <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("PAY_TYPE like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("PAY_TYPE not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("PAY_TYPE in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("PAY_TYPE not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("PAY_TYPE between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("PAY_TYPE not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayModeCodeIsNull() {
            addCriterion("PAY_MODE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPayModeCodeIsNotNull() {
            addCriterion("PAY_MODE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPayModeCodeEqualTo(String value) {
            addCriterion("PAY_MODE_CODE =", value, "payModeCode");
            return (Criteria) this;
        }

        public Criteria andPayModeCodeNotEqualTo(String value) {
            addCriterion("PAY_MODE_CODE <>", value, "payModeCode");
            return (Criteria) this;
        }

        public Criteria andPayModeCodeGreaterThan(String value) {
            addCriterion("PAY_MODE_CODE >", value, "payModeCode");
            return (Criteria) this;
        }

        public Criteria andPayModeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_MODE_CODE >=", value, "payModeCode");
            return (Criteria) this;
        }

        public Criteria andPayModeCodeLessThan(String value) {
            addCriterion("PAY_MODE_CODE <", value, "payModeCode");
            return (Criteria) this;
        }

        public Criteria andPayModeCodeLessThanOrEqualTo(String value) {
            addCriterion("PAY_MODE_CODE <=", value, "payModeCode");
            return (Criteria) this;
        }

        public Criteria andPayModeCodeLike(String value) {
            addCriterion("PAY_MODE_CODE like", value, "payModeCode");
            return (Criteria) this;
        }

        public Criteria andPayModeCodeNotLike(String value) {
            addCriterion("PAY_MODE_CODE not like", value, "payModeCode");
            return (Criteria) this;
        }

        public Criteria andPayModeCodeIn(List<String> values) {
            addCriterion("PAY_MODE_CODE in", values, "payModeCode");
            return (Criteria) this;
        }

        public Criteria andPayModeCodeNotIn(List<String> values) {
            addCriterion("PAY_MODE_CODE not in", values, "payModeCode");
            return (Criteria) this;
        }

        public Criteria andPayModeCodeBetween(String value1, String value2) {
            addCriterion("PAY_MODE_CODE between", value1, value2, "payModeCode");
            return (Criteria) this;
        }

        public Criteria andPayModeCodeNotBetween(String value1, String value2) {
            addCriterion("PAY_MODE_CODE not between", value1, value2, "payModeCode");
            return (Criteria) this;
        }

        public Criteria andPayModeIsNull() {
            addCriterion("PAY_MODE is null");
            return (Criteria) this;
        }

        public Criteria andPayModeIsNotNull() {
            addCriterion("PAY_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andPayModeEqualTo(String value) {
            addCriterion("PAY_MODE =", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotEqualTo(String value) {
            addCriterion("PAY_MODE <>", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeGreaterThan(String value) {
            addCriterion("PAY_MODE >", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_MODE >=", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeLessThan(String value) {
            addCriterion("PAY_MODE <", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeLessThanOrEqualTo(String value) {
            addCriterion("PAY_MODE <=", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeLike(String value) {
            addCriterion("PAY_MODE like", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotLike(String value) {
            addCriterion("PAY_MODE not like", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeIn(List<String> values) {
            addCriterion("PAY_MODE in", values, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotIn(List<String> values) {
            addCriterion("PAY_MODE not in", values, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeBetween(String value1, String value2) {
            addCriterion("PAY_MODE between", value1, value2, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotBetween(String value1, String value2) {
            addCriterion("PAY_MODE not between", value1, value2, "payMode");
            return (Criteria) this;
        }

        public Criteria andUserPropertyCodeIsNull() {
            addCriterion("USER_PROPERTY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUserPropertyCodeIsNotNull() {
            addCriterion("USER_PROPERTY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUserPropertyCodeEqualTo(String value) {
            addCriterion("USER_PROPERTY_CODE =", value, "userPropertyCode");
            return (Criteria) this;
        }

        public Criteria andUserPropertyCodeNotEqualTo(String value) {
            addCriterion("USER_PROPERTY_CODE <>", value, "userPropertyCode");
            return (Criteria) this;
        }

        public Criteria andUserPropertyCodeGreaterThan(String value) {
            addCriterion("USER_PROPERTY_CODE >", value, "userPropertyCode");
            return (Criteria) this;
        }

        public Criteria andUserPropertyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PROPERTY_CODE >=", value, "userPropertyCode");
            return (Criteria) this;
        }

        public Criteria andUserPropertyCodeLessThan(String value) {
            addCriterion("USER_PROPERTY_CODE <", value, "userPropertyCode");
            return (Criteria) this;
        }

        public Criteria andUserPropertyCodeLessThanOrEqualTo(String value) {
            addCriterion("USER_PROPERTY_CODE <=", value, "userPropertyCode");
            return (Criteria) this;
        }

        public Criteria andUserPropertyCodeLike(String value) {
            addCriterion("USER_PROPERTY_CODE like", value, "userPropertyCode");
            return (Criteria) this;
        }

        public Criteria andUserPropertyCodeNotLike(String value) {
            addCriterion("USER_PROPERTY_CODE not like", value, "userPropertyCode");
            return (Criteria) this;
        }

        public Criteria andUserPropertyCodeIn(List<String> values) {
            addCriterion("USER_PROPERTY_CODE in", values, "userPropertyCode");
            return (Criteria) this;
        }

        public Criteria andUserPropertyCodeNotIn(List<String> values) {
            addCriterion("USER_PROPERTY_CODE not in", values, "userPropertyCode");
            return (Criteria) this;
        }

        public Criteria andUserPropertyCodeBetween(String value1, String value2) {
            addCriterion("USER_PROPERTY_CODE between", value1, value2, "userPropertyCode");
            return (Criteria) this;
        }

        public Criteria andUserPropertyCodeNotBetween(String value1, String value2) {
            addCriterion("USER_PROPERTY_CODE not between", value1, value2, "userPropertyCode");
            return (Criteria) this;
        }

        public Criteria andUserPropertyIsNull() {
            addCriterion("USER_PROPERTY is null");
            return (Criteria) this;
        }

        public Criteria andUserPropertyIsNotNull() {
            addCriterion("USER_PROPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andUserPropertyEqualTo(String value) {
            addCriterion("USER_PROPERTY =", value, "userProperty");
            return (Criteria) this;
        }

        public Criteria andUserPropertyNotEqualTo(String value) {
            addCriterion("USER_PROPERTY <>", value, "userProperty");
            return (Criteria) this;
        }

        public Criteria andUserPropertyGreaterThan(String value) {
            addCriterion("USER_PROPERTY >", value, "userProperty");
            return (Criteria) this;
        }

        public Criteria andUserPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PROPERTY >=", value, "userProperty");
            return (Criteria) this;
        }

        public Criteria andUserPropertyLessThan(String value) {
            addCriterion("USER_PROPERTY <", value, "userProperty");
            return (Criteria) this;
        }

        public Criteria andUserPropertyLessThanOrEqualTo(String value) {
            addCriterion("USER_PROPERTY <=", value, "userProperty");
            return (Criteria) this;
        }

        public Criteria andUserPropertyLike(String value) {
            addCriterion("USER_PROPERTY like", value, "userProperty");
            return (Criteria) this;
        }

        public Criteria andUserPropertyNotLike(String value) {
            addCriterion("USER_PROPERTY not like", value, "userProperty");
            return (Criteria) this;
        }

        public Criteria andUserPropertyIn(List<String> values) {
            addCriterion("USER_PROPERTY in", values, "userProperty");
            return (Criteria) this;
        }

        public Criteria andUserPropertyNotIn(List<String> values) {
            addCriterion("USER_PROPERTY not in", values, "userProperty");
            return (Criteria) this;
        }

        public Criteria andUserPropertyBetween(String value1, String value2) {
            addCriterion("USER_PROPERTY between", value1, value2, "userProperty");
            return (Criteria) this;
        }

        public Criteria andUserPropertyNotBetween(String value1, String value2) {
            addCriterion("USER_PROPERTY not between", value1, value2, "userProperty");
            return (Criteria) this;
        }

        public Criteria andStatusCodeIsNull() {
            addCriterion("STATUS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andStatusCodeIsNotNull() {
            addCriterion("STATUS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andStatusCodeEqualTo(String value) {
            addCriterion("STATUS_CODE =", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotEqualTo(String value) {
            addCriterion("STATUS_CODE <>", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeGreaterThan(String value) {
            addCriterion("STATUS_CODE >", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS_CODE >=", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeLessThan(String value) {
            addCriterion("STATUS_CODE <", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeLessThanOrEqualTo(String value) {
            addCriterion("STATUS_CODE <=", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeLike(String value) {
            addCriterion("STATUS_CODE like", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotLike(String value) {
            addCriterion("STATUS_CODE not like", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeIn(List<String> values) {
            addCriterion("STATUS_CODE in", values, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotIn(List<String> values) {
            addCriterion("STATUS_CODE not in", values, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeBetween(String value1, String value2) {
            addCriterion("STATUS_CODE between", value1, value2, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotBetween(String value1, String value2) {
            addCriterion("STATUS_CODE not between", value1, value2, "statusCode");
            return (Criteria) this;
        }

        public Criteria andUserStatusDescIsNull() {
            addCriterion("USER_STATUS_DESC is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusDescIsNotNull() {
            addCriterion("USER_STATUS_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusDescEqualTo(String value) {
            addCriterion("USER_STATUS_DESC =", value, "userStatusDesc");
            return (Criteria) this;
        }

        public Criteria andUserStatusDescNotEqualTo(String value) {
            addCriterion("USER_STATUS_DESC <>", value, "userStatusDesc");
            return (Criteria) this;
        }

        public Criteria andUserStatusDescGreaterThan(String value) {
            addCriterion("USER_STATUS_DESC >", value, "userStatusDesc");
            return (Criteria) this;
        }

        public Criteria andUserStatusDescGreaterThanOrEqualTo(String value) {
            addCriterion("USER_STATUS_DESC >=", value, "userStatusDesc");
            return (Criteria) this;
        }

        public Criteria andUserStatusDescLessThan(String value) {
            addCriterion("USER_STATUS_DESC <", value, "userStatusDesc");
            return (Criteria) this;
        }

        public Criteria andUserStatusDescLessThanOrEqualTo(String value) {
            addCriterion("USER_STATUS_DESC <=", value, "userStatusDesc");
            return (Criteria) this;
        }

        public Criteria andUserStatusDescLike(String value) {
            addCriterion("USER_STATUS_DESC like", value, "userStatusDesc");
            return (Criteria) this;
        }

        public Criteria andUserStatusDescNotLike(String value) {
            addCriterion("USER_STATUS_DESC not like", value, "userStatusDesc");
            return (Criteria) this;
        }

        public Criteria andUserStatusDescIn(List<String> values) {
            addCriterion("USER_STATUS_DESC in", values, "userStatusDesc");
            return (Criteria) this;
        }

        public Criteria andUserStatusDescNotIn(List<String> values) {
            addCriterion("USER_STATUS_DESC not in", values, "userStatusDesc");
            return (Criteria) this;
        }

        public Criteria andUserStatusDescBetween(String value1, String value2) {
            addCriterion("USER_STATUS_DESC between", value1, value2, "userStatusDesc");
            return (Criteria) this;
        }

        public Criteria andUserStatusDescNotBetween(String value1, String value2) {
            addCriterion("USER_STATUS_DESC not between", value1, value2, "userStatusDesc");
            return (Criteria) this;
        }

        public Criteria andInnetDateIsNull() {
            addCriterion("INNET_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInnetDateIsNotNull() {
            addCriterion("INNET_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInnetDateEqualTo(Date value) {
            addCriterion("INNET_DATE =", value, "innetDate");
            return (Criteria) this;
        }

        public Criteria andInnetDateNotEqualTo(Date value) {
            addCriterion("INNET_DATE <>", value, "innetDate");
            return (Criteria) this;
        }

        public Criteria andInnetDateGreaterThan(Date value) {
            addCriterion("INNET_DATE >", value, "innetDate");
            return (Criteria) this;
        }

        public Criteria andInnetDateGreaterThanOrEqualTo(Date value) {
            addCriterion("INNET_DATE >=", value, "innetDate");
            return (Criteria) this;
        }

        public Criteria andInnetDateLessThan(Date value) {
            addCriterion("INNET_DATE <", value, "innetDate");
            return (Criteria) this;
        }

        public Criteria andInnetDateLessThanOrEqualTo(Date value) {
            addCriterion("INNET_DATE <=", value, "innetDate");
            return (Criteria) this;
        }

        public Criteria andInnetDateIn(List<Date> values) {
            addCriterion("INNET_DATE in", values, "innetDate");
            return (Criteria) this;
        }

        public Criteria andInnetDateNotIn(List<Date> values) {
            addCriterion("INNET_DATE not in", values, "innetDate");
            return (Criteria) this;
        }

        public Criteria andInnetDateBetween(Date value1, Date value2) {
            addCriterion("INNET_DATE between", value1, value2, "innetDate");
            return (Criteria) this;
        }

        public Criteria andInnetDateNotBetween(Date value1, Date value2) {
            addCriterion("INNET_DATE not between", value1, value2, "innetDate");
            return (Criteria) this;
        }

        public Criteria andFirstCallTimeIsNull() {
            addCriterion("FIRST_CALL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFirstCallTimeIsNotNull() {
            addCriterion("FIRST_CALL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFirstCallTimeEqualTo(Date value) {
            addCriterion("FIRST_CALL_TIME =", value, "firstCallTime");
            return (Criteria) this;
        }

        public Criteria andFirstCallTimeNotEqualTo(Date value) {
            addCriterion("FIRST_CALL_TIME <>", value, "firstCallTime");
            return (Criteria) this;
        }

        public Criteria andFirstCallTimeGreaterThan(Date value) {
            addCriterion("FIRST_CALL_TIME >", value, "firstCallTime");
            return (Criteria) this;
        }

        public Criteria andFirstCallTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FIRST_CALL_TIME >=", value, "firstCallTime");
            return (Criteria) this;
        }

        public Criteria andFirstCallTimeLessThan(Date value) {
            addCriterion("FIRST_CALL_TIME <", value, "firstCallTime");
            return (Criteria) this;
        }

        public Criteria andFirstCallTimeLessThanOrEqualTo(Date value) {
            addCriterion("FIRST_CALL_TIME <=", value, "firstCallTime");
            return (Criteria) this;
        }

        public Criteria andFirstCallTimeIn(List<Date> values) {
            addCriterion("FIRST_CALL_TIME in", values, "firstCallTime");
            return (Criteria) this;
        }

        public Criteria andFirstCallTimeNotIn(List<Date> values) {
            addCriterion("FIRST_CALL_TIME not in", values, "firstCallTime");
            return (Criteria) this;
        }

        public Criteria andFirstCallTimeBetween(Date value1, Date value2) {
            addCriterion("FIRST_CALL_TIME between", value1, value2, "firstCallTime");
            return (Criteria) this;
        }

        public Criteria andFirstCallTimeNotBetween(Date value1, Date value2) {
            addCriterion("FIRST_CALL_TIME not between", value1, value2, "firstCallTime");
            return (Criteria) this;
        }

        public Criteria andShutDownTimeIsNull() {
            addCriterion("SHUT_DOWN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andShutDownTimeIsNotNull() {
            addCriterion("SHUT_DOWN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andShutDownTimeEqualTo(Date value) {
            addCriterion("SHUT_DOWN_TIME =", value, "shutDownTime");
            return (Criteria) this;
        }

        public Criteria andShutDownTimeNotEqualTo(Date value) {
            addCriterion("SHUT_DOWN_TIME <>", value, "shutDownTime");
            return (Criteria) this;
        }

        public Criteria andShutDownTimeGreaterThan(Date value) {
            addCriterion("SHUT_DOWN_TIME >", value, "shutDownTime");
            return (Criteria) this;
        }

        public Criteria andShutDownTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SHUT_DOWN_TIME >=", value, "shutDownTime");
            return (Criteria) this;
        }

        public Criteria andShutDownTimeLessThan(Date value) {
            addCriterion("SHUT_DOWN_TIME <", value, "shutDownTime");
            return (Criteria) this;
        }

        public Criteria andShutDownTimeLessThanOrEqualTo(Date value) {
            addCriterion("SHUT_DOWN_TIME <=", value, "shutDownTime");
            return (Criteria) this;
        }

        public Criteria andShutDownTimeIn(List<Date> values) {
            addCriterion("SHUT_DOWN_TIME in", values, "shutDownTime");
            return (Criteria) this;
        }

        public Criteria andShutDownTimeNotIn(List<Date> values) {
            addCriterion("SHUT_DOWN_TIME not in", values, "shutDownTime");
            return (Criteria) this;
        }

        public Criteria andShutDownTimeBetween(Date value1, Date value2) {
            addCriterion("SHUT_DOWN_TIME between", value1, value2, "shutDownTime");
            return (Criteria) this;
        }

        public Criteria andShutDownTimeNotBetween(Date value1, Date value2) {
            addCriterion("SHUT_DOWN_TIME not between", value1, value2, "shutDownTime");
            return (Criteria) this;
        }

        public Criteria andQuitNetTimeIsNull() {
            addCriterion("QUIT_NET_TIME is null");
            return (Criteria) this;
        }

        public Criteria andQuitNetTimeIsNotNull() {
            addCriterion("QUIT_NET_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andQuitNetTimeEqualTo(Date value) {
            addCriterion("QUIT_NET_TIME =", value, "quitNetTime");
            return (Criteria) this;
        }

        public Criteria andQuitNetTimeNotEqualTo(Date value) {
            addCriterion("QUIT_NET_TIME <>", value, "quitNetTime");
            return (Criteria) this;
        }

        public Criteria andQuitNetTimeGreaterThan(Date value) {
            addCriterion("QUIT_NET_TIME >", value, "quitNetTime");
            return (Criteria) this;
        }

        public Criteria andQuitNetTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("QUIT_NET_TIME >=", value, "quitNetTime");
            return (Criteria) this;
        }

        public Criteria andQuitNetTimeLessThan(Date value) {
            addCriterion("QUIT_NET_TIME <", value, "quitNetTime");
            return (Criteria) this;
        }

        public Criteria andQuitNetTimeLessThanOrEqualTo(Date value) {
            addCriterion("QUIT_NET_TIME <=", value, "quitNetTime");
            return (Criteria) this;
        }

        public Criteria andQuitNetTimeIn(List<Date> values) {
            addCriterion("QUIT_NET_TIME in", values, "quitNetTime");
            return (Criteria) this;
        }

        public Criteria andQuitNetTimeNotIn(List<Date> values) {
            addCriterion("QUIT_NET_TIME not in", values, "quitNetTime");
            return (Criteria) this;
        }

        public Criteria andQuitNetTimeBetween(Date value1, Date value2) {
            addCriterion("QUIT_NET_TIME between", value1, value2, "quitNetTime");
            return (Criteria) this;
        }

        public Criteria andQuitNetTimeNotBetween(Date value1, Date value2) {
            addCriterion("QUIT_NET_TIME not between", value1, value2, "quitNetTime");
            return (Criteria) this;
        }

        public Criteria andInnetMonthIsNull() {
            addCriterion("INNET_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andInnetMonthIsNotNull() {
            addCriterion("INNET_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andInnetMonthEqualTo(Short value) {
            addCriterion("INNET_MONTH =", value, "innetMonth");
            return (Criteria) this;
        }

        public Criteria andInnetMonthNotEqualTo(Short value) {
            addCriterion("INNET_MONTH <>", value, "innetMonth");
            return (Criteria) this;
        }

        public Criteria andInnetMonthGreaterThan(Short value) {
            addCriterion("INNET_MONTH >", value, "innetMonth");
            return (Criteria) this;
        }

        public Criteria andInnetMonthGreaterThanOrEqualTo(Short value) {
            addCriterion("INNET_MONTH >=", value, "innetMonth");
            return (Criteria) this;
        }

        public Criteria andInnetMonthLessThan(Short value) {
            addCriterion("INNET_MONTH <", value, "innetMonth");
            return (Criteria) this;
        }

        public Criteria andInnetMonthLessThanOrEqualTo(Short value) {
            addCriterion("INNET_MONTH <=", value, "innetMonth");
            return (Criteria) this;
        }

        public Criteria andInnetMonthIn(List<Short> values) {
            addCriterion("INNET_MONTH in", values, "innetMonth");
            return (Criteria) this;
        }

        public Criteria andInnetMonthNotIn(List<Short> values) {
            addCriterion("INNET_MONTH not in", values, "innetMonth");
            return (Criteria) this;
        }

        public Criteria andInnetMonthBetween(Short value1, Short value2) {
            addCriterion("INNET_MONTH between", value1, value2, "innetMonth");
            return (Criteria) this;
        }

        public Criteria andInnetMonthNotBetween(Short value1, Short value2) {
            addCriterion("INNET_MONTH not between", value1, value2, "innetMonth");
            return (Criteria) this;
        }

        public Criteria andUserDinnerIsNull() {
            addCriterion("USER_DINNER is null");
            return (Criteria) this;
        }

        public Criteria andUserDinnerIsNotNull() {
            addCriterion("USER_DINNER is not null");
            return (Criteria) this;
        }

        public Criteria andUserDinnerEqualTo(String value) {
            addCriterion("USER_DINNER =", value, "userDinner");
            return (Criteria) this;
        }

        public Criteria andUserDinnerNotEqualTo(String value) {
            addCriterion("USER_DINNER <>", value, "userDinner");
            return (Criteria) this;
        }

        public Criteria andUserDinnerGreaterThan(String value) {
            addCriterion("USER_DINNER >", value, "userDinner");
            return (Criteria) this;
        }

        public Criteria andUserDinnerGreaterThanOrEqualTo(String value) {
            addCriterion("USER_DINNER >=", value, "userDinner");
            return (Criteria) this;
        }

        public Criteria andUserDinnerLessThan(String value) {
            addCriterion("USER_DINNER <", value, "userDinner");
            return (Criteria) this;
        }

        public Criteria andUserDinnerLessThanOrEqualTo(String value) {
            addCriterion("USER_DINNER <=", value, "userDinner");
            return (Criteria) this;
        }

        public Criteria andUserDinnerLike(String value) {
            addCriterion("USER_DINNER like", value, "userDinner");
            return (Criteria) this;
        }

        public Criteria andUserDinnerNotLike(String value) {
            addCriterion("USER_DINNER not like", value, "userDinner");
            return (Criteria) this;
        }

        public Criteria andUserDinnerIn(List<String> values) {
            addCriterion("USER_DINNER in", values, "userDinner");
            return (Criteria) this;
        }

        public Criteria andUserDinnerNotIn(List<String> values) {
            addCriterion("USER_DINNER not in", values, "userDinner");
            return (Criteria) this;
        }

        public Criteria andUserDinnerBetween(String value1, String value2) {
            addCriterion("USER_DINNER between", value1, value2, "userDinner");
            return (Criteria) this;
        }

        public Criteria andUserDinnerNotBetween(String value1, String value2) {
            addCriterion("USER_DINNER not between", value1, value2, "userDinner");
            return (Criteria) this;
        }

        public Criteria andUserDinnerDescIsNull() {
            addCriterion("USER_DINNER_DESC is null");
            return (Criteria) this;
        }

        public Criteria andUserDinnerDescIsNotNull() {
            addCriterion("USER_DINNER_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andUserDinnerDescEqualTo(String value) {
            addCriterion("USER_DINNER_DESC =", value, "userDinnerDesc");
            return (Criteria) this;
        }

        public Criteria andUserDinnerDescNotEqualTo(String value) {
            addCriterion("USER_DINNER_DESC <>", value, "userDinnerDesc");
            return (Criteria) this;
        }

        public Criteria andUserDinnerDescGreaterThan(String value) {
            addCriterion("USER_DINNER_DESC >", value, "userDinnerDesc");
            return (Criteria) this;
        }

        public Criteria andUserDinnerDescGreaterThanOrEqualTo(String value) {
            addCriterion("USER_DINNER_DESC >=", value, "userDinnerDesc");
            return (Criteria) this;
        }

        public Criteria andUserDinnerDescLessThan(String value) {
            addCriterion("USER_DINNER_DESC <", value, "userDinnerDesc");
            return (Criteria) this;
        }

        public Criteria andUserDinnerDescLessThanOrEqualTo(String value) {
            addCriterion("USER_DINNER_DESC <=", value, "userDinnerDesc");
            return (Criteria) this;
        }

        public Criteria andUserDinnerDescLike(String value) {
            addCriterion("USER_DINNER_DESC like", value, "userDinnerDesc");
            return (Criteria) this;
        }

        public Criteria andUserDinnerDescNotLike(String value) {
            addCriterion("USER_DINNER_DESC not like", value, "userDinnerDesc");
            return (Criteria) this;
        }

        public Criteria andUserDinnerDescIn(List<String> values) {
            addCriterion("USER_DINNER_DESC in", values, "userDinnerDesc");
            return (Criteria) this;
        }

        public Criteria andUserDinnerDescNotIn(List<String> values) {
            addCriterion("USER_DINNER_DESC not in", values, "userDinnerDesc");
            return (Criteria) this;
        }

        public Criteria andUserDinnerDescBetween(String value1, String value2) {
            addCriterion("USER_DINNER_DESC between", value1, value2, "userDinnerDesc");
            return (Criteria) this;
        }

        public Criteria andUserDinnerDescNotBetween(String value1, String value2) {
            addCriterion("USER_DINNER_DESC not between", value1, value2, "userDinnerDesc");
            return (Criteria) this;
        }

        public Criteria andDinnerDescIsNull() {
            addCriterion("DINNER_DESC is null");
            return (Criteria) this;
        }

        public Criteria andDinnerDescIsNotNull() {
            addCriterion("DINNER_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andDinnerDescEqualTo(String value) {
            addCriterion("DINNER_DESC =", value, "dinnerDesc");
            return (Criteria) this;
        }

        public Criteria andDinnerDescNotEqualTo(String value) {
            addCriterion("DINNER_DESC <>", value, "dinnerDesc");
            return (Criteria) this;
        }

        public Criteria andDinnerDescGreaterThan(String value) {
            addCriterion("DINNER_DESC >", value, "dinnerDesc");
            return (Criteria) this;
        }

        public Criteria andDinnerDescGreaterThanOrEqualTo(String value) {
            addCriterion("DINNER_DESC >=", value, "dinnerDesc");
            return (Criteria) this;
        }

        public Criteria andDinnerDescLessThan(String value) {
            addCriterion("DINNER_DESC <", value, "dinnerDesc");
            return (Criteria) this;
        }

        public Criteria andDinnerDescLessThanOrEqualTo(String value) {
            addCriterion("DINNER_DESC <=", value, "dinnerDesc");
            return (Criteria) this;
        }

        public Criteria andDinnerDescLike(String value) {
            addCriterion("DINNER_DESC like", value, "dinnerDesc");
            return (Criteria) this;
        }

        public Criteria andDinnerDescNotLike(String value) {
            addCriterion("DINNER_DESC not like", value, "dinnerDesc");
            return (Criteria) this;
        }

        public Criteria andDinnerDescIn(List<String> values) {
            addCriterion("DINNER_DESC in", values, "dinnerDesc");
            return (Criteria) this;
        }

        public Criteria andDinnerDescNotIn(List<String> values) {
            addCriterion("DINNER_DESC not in", values, "dinnerDesc");
            return (Criteria) this;
        }

        public Criteria andDinnerDescBetween(String value1, String value2) {
            addCriterion("DINNER_DESC between", value1, value2, "dinnerDesc");
            return (Criteria) this;
        }

        public Criteria andDinnerDescNotBetween(String value1, String value2) {
            addCriterion("DINNER_DESC not between", value1, value2, "dinnerDesc");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeIsNull() {
            addCriterion("OFFICE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeIsNotNull() {
            addCriterion("OFFICE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeEqualTo(String value) {
            addCriterion("OFFICE_CODE =", value, "officeCode");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeNotEqualTo(String value) {
            addCriterion("OFFICE_CODE <>", value, "officeCode");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeGreaterThan(String value) {
            addCriterion("OFFICE_CODE >", value, "officeCode");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICE_CODE >=", value, "officeCode");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeLessThan(String value) {
            addCriterion("OFFICE_CODE <", value, "officeCode");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeLessThanOrEqualTo(String value) {
            addCriterion("OFFICE_CODE <=", value, "officeCode");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeLike(String value) {
            addCriterion("OFFICE_CODE like", value, "officeCode");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeNotLike(String value) {
            addCriterion("OFFICE_CODE not like", value, "officeCode");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeIn(List<String> values) {
            addCriterion("OFFICE_CODE in", values, "officeCode");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeNotIn(List<String> values) {
            addCriterion("OFFICE_CODE not in", values, "officeCode");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeBetween(String value1, String value2) {
            addCriterion("OFFICE_CODE between", value1, value2, "officeCode");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeNotBetween(String value1, String value2) {
            addCriterion("OFFICE_CODE not between", value1, value2, "officeCode");
            return (Criteria) this;
        }

        public Criteria andOfficeIsNull() {
            addCriterion("OFFICE is null");
            return (Criteria) this;
        }

        public Criteria andOfficeIsNotNull() {
            addCriterion("OFFICE is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeEqualTo(String value) {
            addCriterion("OFFICE =", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeNotEqualTo(String value) {
            addCriterion("OFFICE <>", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeGreaterThan(String value) {
            addCriterion("OFFICE >", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICE >=", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeLessThan(String value) {
            addCriterion("OFFICE <", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeLessThanOrEqualTo(String value) {
            addCriterion("OFFICE <=", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeLike(String value) {
            addCriterion("OFFICE like", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeNotLike(String value) {
            addCriterion("OFFICE not like", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeIn(List<String> values) {
            addCriterion("OFFICE in", values, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeNotIn(List<String> values) {
            addCriterion("OFFICE not in", values, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeBetween(String value1, String value2) {
            addCriterion("OFFICE between", value1, value2, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeNotBetween(String value1, String value2) {
            addCriterion("OFFICE not between", value1, value2, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeDetailIsNull() {
            addCriterion("OFFICE_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andOfficeDetailIsNotNull() {
            addCriterion("OFFICE_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeDetailEqualTo(String value) {
            addCriterion("OFFICE_DETAIL =", value, "officeDetail");
            return (Criteria) this;
        }

        public Criteria andOfficeDetailNotEqualTo(String value) {
            addCriterion("OFFICE_DETAIL <>", value, "officeDetail");
            return (Criteria) this;
        }

        public Criteria andOfficeDetailGreaterThan(String value) {
            addCriterion("OFFICE_DETAIL >", value, "officeDetail");
            return (Criteria) this;
        }

        public Criteria andOfficeDetailGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICE_DETAIL >=", value, "officeDetail");
            return (Criteria) this;
        }

        public Criteria andOfficeDetailLessThan(String value) {
            addCriterion("OFFICE_DETAIL <", value, "officeDetail");
            return (Criteria) this;
        }

        public Criteria andOfficeDetailLessThanOrEqualTo(String value) {
            addCriterion("OFFICE_DETAIL <=", value, "officeDetail");
            return (Criteria) this;
        }

        public Criteria andOfficeDetailLike(String value) {
            addCriterion("OFFICE_DETAIL like", value, "officeDetail");
            return (Criteria) this;
        }

        public Criteria andOfficeDetailNotLike(String value) {
            addCriterion("OFFICE_DETAIL not like", value, "officeDetail");
            return (Criteria) this;
        }

        public Criteria andOfficeDetailIn(List<String> values) {
            addCriterion("OFFICE_DETAIL in", values, "officeDetail");
            return (Criteria) this;
        }

        public Criteria andOfficeDetailNotIn(List<String> values) {
            addCriterion("OFFICE_DETAIL not in", values, "officeDetail");
            return (Criteria) this;
        }

        public Criteria andOfficeDetailBetween(String value1, String value2) {
            addCriterion("OFFICE_DETAIL between", value1, value2, "officeDetail");
            return (Criteria) this;
        }

        public Criteria andOfficeDetailNotBetween(String value1, String value2) {
            addCriterion("OFFICE_DETAIL not between", value1, value2, "officeDetail");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("GROUP_ID =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("GROUP_ID <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("GROUP_ID >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_ID >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("GROUP_ID <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("GROUP_ID <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("GROUP_ID like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("GROUP_ID not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("GROUP_ID in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("GROUP_ID not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("GROUP_ID between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("GROUP_ID not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("GROUP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("GROUP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("GROUP_NAME =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("GROUP_NAME <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("GROUP_NAME >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_NAME >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("GROUP_NAME <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("GROUP_NAME <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("GROUP_NAME like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("GROUP_NAME not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("GROUP_NAME in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("GROUP_NAME not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("GROUP_NAME between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("GROUP_NAME not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeCodeIsNull() {
            addCriterion("GROUP_USER_TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeCodeIsNotNull() {
            addCriterion("GROUP_USER_TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeCodeEqualTo(String value) {
            addCriterion("GROUP_USER_TYPE_CODE =", value, "groupUserTypeCode");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeCodeNotEqualTo(String value) {
            addCriterion("GROUP_USER_TYPE_CODE <>", value, "groupUserTypeCode");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeCodeGreaterThan(String value) {
            addCriterion("GROUP_USER_TYPE_CODE >", value, "groupUserTypeCode");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_USER_TYPE_CODE >=", value, "groupUserTypeCode");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeCodeLessThan(String value) {
            addCriterion("GROUP_USER_TYPE_CODE <", value, "groupUserTypeCode");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("GROUP_USER_TYPE_CODE <=", value, "groupUserTypeCode");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeCodeLike(String value) {
            addCriterion("GROUP_USER_TYPE_CODE like", value, "groupUserTypeCode");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeCodeNotLike(String value) {
            addCriterion("GROUP_USER_TYPE_CODE not like", value, "groupUserTypeCode");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeCodeIn(List<String> values) {
            addCriterion("GROUP_USER_TYPE_CODE in", values, "groupUserTypeCode");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeCodeNotIn(List<String> values) {
            addCriterion("GROUP_USER_TYPE_CODE not in", values, "groupUserTypeCode");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeCodeBetween(String value1, String value2) {
            addCriterion("GROUP_USER_TYPE_CODE between", value1, value2, "groupUserTypeCode");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeCodeNotBetween(String value1, String value2) {
            addCriterion("GROUP_USER_TYPE_CODE not between", value1, value2, "groupUserTypeCode");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeIsNull() {
            addCriterion("GROUP_USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeIsNotNull() {
            addCriterion("GROUP_USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeEqualTo(String value) {
            addCriterion("GROUP_USER_TYPE =", value, "groupUserType");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeNotEqualTo(String value) {
            addCriterion("GROUP_USER_TYPE <>", value, "groupUserType");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeGreaterThan(String value) {
            addCriterion("GROUP_USER_TYPE >", value, "groupUserType");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_USER_TYPE >=", value, "groupUserType");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeLessThan(String value) {
            addCriterion("GROUP_USER_TYPE <", value, "groupUserType");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeLessThanOrEqualTo(String value) {
            addCriterion("GROUP_USER_TYPE <=", value, "groupUserType");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeLike(String value) {
            addCriterion("GROUP_USER_TYPE like", value, "groupUserType");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeNotLike(String value) {
            addCriterion("GROUP_USER_TYPE not like", value, "groupUserType");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeIn(List<String> values) {
            addCriterion("GROUP_USER_TYPE in", values, "groupUserType");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeNotIn(List<String> values) {
            addCriterion("GROUP_USER_TYPE not in", values, "groupUserType");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeBetween(String value1, String value2) {
            addCriterion("GROUP_USER_TYPE between", value1, value2, "groupUserType");
            return (Criteria) this;
        }

        public Criteria andGroupUserTypeNotBetween(String value1, String value2) {
            addCriterion("GROUP_USER_TYPE not between", value1, value2, "groupUserType");
            return (Criteria) this;
        }

        public Criteria andGroupItemIdIsNull() {
            addCriterion("GROUP_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andGroupItemIdIsNotNull() {
            addCriterion("GROUP_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupItemIdEqualTo(String value) {
            addCriterion("GROUP_ITEM_ID =", value, "groupItemId");
            return (Criteria) this;
        }

        public Criteria andGroupItemIdNotEqualTo(String value) {
            addCriterion("GROUP_ITEM_ID <>", value, "groupItemId");
            return (Criteria) this;
        }

        public Criteria andGroupItemIdGreaterThan(String value) {
            addCriterion("GROUP_ITEM_ID >", value, "groupItemId");
            return (Criteria) this;
        }

        public Criteria andGroupItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_ITEM_ID >=", value, "groupItemId");
            return (Criteria) this;
        }

        public Criteria andGroupItemIdLessThan(String value) {
            addCriterion("GROUP_ITEM_ID <", value, "groupItemId");
            return (Criteria) this;
        }

        public Criteria andGroupItemIdLessThanOrEqualTo(String value) {
            addCriterion("GROUP_ITEM_ID <=", value, "groupItemId");
            return (Criteria) this;
        }

        public Criteria andGroupItemIdLike(String value) {
            addCriterion("GROUP_ITEM_ID like", value, "groupItemId");
            return (Criteria) this;
        }

        public Criteria andGroupItemIdNotLike(String value) {
            addCriterion("GROUP_ITEM_ID not like", value, "groupItemId");
            return (Criteria) this;
        }

        public Criteria andGroupItemIdIn(List<String> values) {
            addCriterion("GROUP_ITEM_ID in", values, "groupItemId");
            return (Criteria) this;
        }

        public Criteria andGroupItemIdNotIn(List<String> values) {
            addCriterion("GROUP_ITEM_ID not in", values, "groupItemId");
            return (Criteria) this;
        }

        public Criteria andGroupItemIdBetween(String value1, String value2) {
            addCriterion("GROUP_ITEM_ID between", value1, value2, "groupItemId");
            return (Criteria) this;
        }

        public Criteria andGroupItemIdNotBetween(String value1, String value2) {
            addCriterion("GROUP_ITEM_ID not between", value1, value2, "groupItemId");
            return (Criteria) this;
        }

        public Criteria andGroupItemNameIsNull() {
            addCriterion("GROUP_ITEM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGroupItemNameIsNotNull() {
            addCriterion("GROUP_ITEM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGroupItemNameEqualTo(String value) {
            addCriterion("GROUP_ITEM_NAME =", value, "groupItemName");
            return (Criteria) this;
        }

        public Criteria andGroupItemNameNotEqualTo(String value) {
            addCriterion("GROUP_ITEM_NAME <>", value, "groupItemName");
            return (Criteria) this;
        }

        public Criteria andGroupItemNameGreaterThan(String value) {
            addCriterion("GROUP_ITEM_NAME >", value, "groupItemName");
            return (Criteria) this;
        }

        public Criteria andGroupItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_ITEM_NAME >=", value, "groupItemName");
            return (Criteria) this;
        }

        public Criteria andGroupItemNameLessThan(String value) {
            addCriterion("GROUP_ITEM_NAME <", value, "groupItemName");
            return (Criteria) this;
        }

        public Criteria andGroupItemNameLessThanOrEqualTo(String value) {
            addCriterion("GROUP_ITEM_NAME <=", value, "groupItemName");
            return (Criteria) this;
        }

        public Criteria andGroupItemNameLike(String value) {
            addCriterion("GROUP_ITEM_NAME like", value, "groupItemName");
            return (Criteria) this;
        }

        public Criteria andGroupItemNameNotLike(String value) {
            addCriterion("GROUP_ITEM_NAME not like", value, "groupItemName");
            return (Criteria) this;
        }

        public Criteria andGroupItemNameIn(List<String> values) {
            addCriterion("GROUP_ITEM_NAME in", values, "groupItemName");
            return (Criteria) this;
        }

        public Criteria andGroupItemNameNotIn(List<String> values) {
            addCriterion("GROUP_ITEM_NAME not in", values, "groupItemName");
            return (Criteria) this;
        }

        public Criteria andGroupItemNameBetween(String value1, String value2) {
            addCriterion("GROUP_ITEM_NAME between", value1, value2, "groupItemName");
            return (Criteria) this;
        }

        public Criteria andGroupItemNameNotBetween(String value1, String value2) {
            addCriterion("GROUP_ITEM_NAME not between", value1, value2, "groupItemName");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeCodeIsNull() {
            addCriterion("GROUP_ITEM_TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeCodeIsNotNull() {
            addCriterion("GROUP_ITEM_TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeCodeEqualTo(String value) {
            addCriterion("GROUP_ITEM_TYPE_CODE =", value, "groupItemTypeCode");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeCodeNotEqualTo(String value) {
            addCriterion("GROUP_ITEM_TYPE_CODE <>", value, "groupItemTypeCode");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeCodeGreaterThan(String value) {
            addCriterion("GROUP_ITEM_TYPE_CODE >", value, "groupItemTypeCode");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_ITEM_TYPE_CODE >=", value, "groupItemTypeCode");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeCodeLessThan(String value) {
            addCriterion("GROUP_ITEM_TYPE_CODE <", value, "groupItemTypeCode");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("GROUP_ITEM_TYPE_CODE <=", value, "groupItemTypeCode");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeCodeLike(String value) {
            addCriterion("GROUP_ITEM_TYPE_CODE like", value, "groupItemTypeCode");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeCodeNotLike(String value) {
            addCriterion("GROUP_ITEM_TYPE_CODE not like", value, "groupItemTypeCode");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeCodeIn(List<String> values) {
            addCriterion("GROUP_ITEM_TYPE_CODE in", values, "groupItemTypeCode");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeCodeNotIn(List<String> values) {
            addCriterion("GROUP_ITEM_TYPE_CODE not in", values, "groupItemTypeCode");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeCodeBetween(String value1, String value2) {
            addCriterion("GROUP_ITEM_TYPE_CODE between", value1, value2, "groupItemTypeCode");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeCodeNotBetween(String value1, String value2) {
            addCriterion("GROUP_ITEM_TYPE_CODE not between", value1, value2, "groupItemTypeCode");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeIsNull() {
            addCriterion("GROUP_ITEM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeIsNotNull() {
            addCriterion("GROUP_ITEM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeEqualTo(String value) {
            addCriterion("GROUP_ITEM_TYPE =", value, "groupItemType");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeNotEqualTo(String value) {
            addCriterion("GROUP_ITEM_TYPE <>", value, "groupItemType");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeGreaterThan(String value) {
            addCriterion("GROUP_ITEM_TYPE >", value, "groupItemType");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_ITEM_TYPE >=", value, "groupItemType");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeLessThan(String value) {
            addCriterion("GROUP_ITEM_TYPE <", value, "groupItemType");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeLessThanOrEqualTo(String value) {
            addCriterion("GROUP_ITEM_TYPE <=", value, "groupItemType");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeLike(String value) {
            addCriterion("GROUP_ITEM_TYPE like", value, "groupItemType");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeNotLike(String value) {
            addCriterion("GROUP_ITEM_TYPE not like", value, "groupItemType");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeIn(List<String> values) {
            addCriterion("GROUP_ITEM_TYPE in", values, "groupItemType");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeNotIn(List<String> values) {
            addCriterion("GROUP_ITEM_TYPE not in", values, "groupItemType");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeBetween(String value1, String value2) {
            addCriterion("GROUP_ITEM_TYPE between", value1, value2, "groupItemType");
            return (Criteria) this;
        }

        public Criteria andGroupItemTypeNotBetween(String value1, String value2) {
            addCriterion("GROUP_ITEM_TYPE not between", value1, value2, "groupItemType");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyCodeIsNull() {
            addCriterion("GROUP_USER_PROPERTY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyCodeIsNotNull() {
            addCriterion("GROUP_USER_PROPERTY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyCodeEqualTo(String value) {
            addCriterion("GROUP_USER_PROPERTY_CODE =", value, "groupUserPropertyCode");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyCodeNotEqualTo(String value) {
            addCriterion("GROUP_USER_PROPERTY_CODE <>", value, "groupUserPropertyCode");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyCodeGreaterThan(String value) {
            addCriterion("GROUP_USER_PROPERTY_CODE >", value, "groupUserPropertyCode");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_USER_PROPERTY_CODE >=", value, "groupUserPropertyCode");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyCodeLessThan(String value) {
            addCriterion("GROUP_USER_PROPERTY_CODE <", value, "groupUserPropertyCode");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyCodeLessThanOrEqualTo(String value) {
            addCriterion("GROUP_USER_PROPERTY_CODE <=", value, "groupUserPropertyCode");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyCodeLike(String value) {
            addCriterion("GROUP_USER_PROPERTY_CODE like", value, "groupUserPropertyCode");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyCodeNotLike(String value) {
            addCriterion("GROUP_USER_PROPERTY_CODE not like", value, "groupUserPropertyCode");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyCodeIn(List<String> values) {
            addCriterion("GROUP_USER_PROPERTY_CODE in", values, "groupUserPropertyCode");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyCodeNotIn(List<String> values) {
            addCriterion("GROUP_USER_PROPERTY_CODE not in", values, "groupUserPropertyCode");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyCodeBetween(String value1, String value2) {
            addCriterion("GROUP_USER_PROPERTY_CODE between", value1, value2, "groupUserPropertyCode");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyCodeNotBetween(String value1, String value2) {
            addCriterion("GROUP_USER_PROPERTY_CODE not between", value1, value2, "groupUserPropertyCode");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyIsNull() {
            addCriterion("GROUP_USER_PROPERTY is null");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyIsNotNull() {
            addCriterion("GROUP_USER_PROPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyEqualTo(String value) {
            addCriterion("GROUP_USER_PROPERTY =", value, "groupUserProperty");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyNotEqualTo(String value) {
            addCriterion("GROUP_USER_PROPERTY <>", value, "groupUserProperty");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyGreaterThan(String value) {
            addCriterion("GROUP_USER_PROPERTY >", value, "groupUserProperty");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_USER_PROPERTY >=", value, "groupUserProperty");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyLessThan(String value) {
            addCriterion("GROUP_USER_PROPERTY <", value, "groupUserProperty");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyLessThanOrEqualTo(String value) {
            addCriterion("GROUP_USER_PROPERTY <=", value, "groupUserProperty");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyLike(String value) {
            addCriterion("GROUP_USER_PROPERTY like", value, "groupUserProperty");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyNotLike(String value) {
            addCriterion("GROUP_USER_PROPERTY not like", value, "groupUserProperty");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyIn(List<String> values) {
            addCriterion("GROUP_USER_PROPERTY in", values, "groupUserProperty");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyNotIn(List<String> values) {
            addCriterion("GROUP_USER_PROPERTY not in", values, "groupUserProperty");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyBetween(String value1, String value2) {
            addCriterion("GROUP_USER_PROPERTY between", value1, value2, "groupUserProperty");
            return (Criteria) this;
        }

        public Criteria andGroupUserPropertyNotBetween(String value1, String value2) {
            addCriterion("GROUP_USER_PROPERTY not between", value1, value2, "groupUserProperty");
            return (Criteria) this;
        }

        public Criteria andCriditLevelCodeIsNull() {
            addCriterion("CRIDIT_LEVEL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCriditLevelCodeIsNotNull() {
            addCriterion("CRIDIT_LEVEL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCriditLevelCodeEqualTo(String value) {
            addCriterion("CRIDIT_LEVEL_CODE =", value, "criditLevelCode");
            return (Criteria) this;
        }

        public Criteria andCriditLevelCodeNotEqualTo(String value) {
            addCriterion("CRIDIT_LEVEL_CODE <>", value, "criditLevelCode");
            return (Criteria) this;
        }

        public Criteria andCriditLevelCodeGreaterThan(String value) {
            addCriterion("CRIDIT_LEVEL_CODE >", value, "criditLevelCode");
            return (Criteria) this;
        }

        public Criteria andCriditLevelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CRIDIT_LEVEL_CODE >=", value, "criditLevelCode");
            return (Criteria) this;
        }

        public Criteria andCriditLevelCodeLessThan(String value) {
            addCriterion("CRIDIT_LEVEL_CODE <", value, "criditLevelCode");
            return (Criteria) this;
        }

        public Criteria andCriditLevelCodeLessThanOrEqualTo(String value) {
            addCriterion("CRIDIT_LEVEL_CODE <=", value, "criditLevelCode");
            return (Criteria) this;
        }

        public Criteria andCriditLevelCodeLike(String value) {
            addCriterion("CRIDIT_LEVEL_CODE like", value, "criditLevelCode");
            return (Criteria) this;
        }

        public Criteria andCriditLevelCodeNotLike(String value) {
            addCriterion("CRIDIT_LEVEL_CODE not like", value, "criditLevelCode");
            return (Criteria) this;
        }

        public Criteria andCriditLevelCodeIn(List<String> values) {
            addCriterion("CRIDIT_LEVEL_CODE in", values, "criditLevelCode");
            return (Criteria) this;
        }

        public Criteria andCriditLevelCodeNotIn(List<String> values) {
            addCriterion("CRIDIT_LEVEL_CODE not in", values, "criditLevelCode");
            return (Criteria) this;
        }

        public Criteria andCriditLevelCodeBetween(String value1, String value2) {
            addCriterion("CRIDIT_LEVEL_CODE between", value1, value2, "criditLevelCode");
            return (Criteria) this;
        }

        public Criteria andCriditLevelCodeNotBetween(String value1, String value2) {
            addCriterion("CRIDIT_LEVEL_CODE not between", value1, value2, "criditLevelCode");
            return (Criteria) this;
        }

        public Criteria andCriditLevelIsNull() {
            addCriterion("CRIDIT_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCriditLevelIsNotNull() {
            addCriterion("CRIDIT_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCriditLevelEqualTo(String value) {
            addCriterion("CRIDIT_LEVEL =", value, "criditLevel");
            return (Criteria) this;
        }

        public Criteria andCriditLevelNotEqualTo(String value) {
            addCriterion("CRIDIT_LEVEL <>", value, "criditLevel");
            return (Criteria) this;
        }

        public Criteria andCriditLevelGreaterThan(String value) {
            addCriterion("CRIDIT_LEVEL >", value, "criditLevel");
            return (Criteria) this;
        }

        public Criteria andCriditLevelGreaterThanOrEqualTo(String value) {
            addCriterion("CRIDIT_LEVEL >=", value, "criditLevel");
            return (Criteria) this;
        }

        public Criteria andCriditLevelLessThan(String value) {
            addCriterion("CRIDIT_LEVEL <", value, "criditLevel");
            return (Criteria) this;
        }

        public Criteria andCriditLevelLessThanOrEqualTo(String value) {
            addCriterion("CRIDIT_LEVEL <=", value, "criditLevel");
            return (Criteria) this;
        }

        public Criteria andCriditLevelLike(String value) {
            addCriterion("CRIDIT_LEVEL like", value, "criditLevel");
            return (Criteria) this;
        }

        public Criteria andCriditLevelNotLike(String value) {
            addCriterion("CRIDIT_LEVEL not like", value, "criditLevel");
            return (Criteria) this;
        }

        public Criteria andCriditLevelIn(List<String> values) {
            addCriterion("CRIDIT_LEVEL in", values, "criditLevel");
            return (Criteria) this;
        }

        public Criteria andCriditLevelNotIn(List<String> values) {
            addCriterion("CRIDIT_LEVEL not in", values, "criditLevel");
            return (Criteria) this;
        }

        public Criteria andCriditLevelBetween(String value1, String value2) {
            addCriterion("CRIDIT_LEVEL between", value1, value2, "criditLevel");
            return (Criteria) this;
        }

        public Criteria andCriditLevelNotBetween(String value1, String value2) {
            addCriterion("CRIDIT_LEVEL not between", value1, value2, "criditLevel");
            return (Criteria) this;
        }

        public Criteria andAllChargeIsNull() {
            addCriterion("ALL_CHARGE is null");
            return (Criteria) this;
        }

        public Criteria andAllChargeIsNotNull() {
            addCriterion("ALL_CHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andAllChargeEqualTo(Short value) {
            addCriterion("ALL_CHARGE =", value, "allCharge");
            return (Criteria) this;
        }

        public Criteria andAllChargeNotEqualTo(Short value) {
            addCriterion("ALL_CHARGE <>", value, "allCharge");
            return (Criteria) this;
        }

        public Criteria andAllChargeGreaterThan(Short value) {
            addCriterion("ALL_CHARGE >", value, "allCharge");
            return (Criteria) this;
        }

        public Criteria andAllChargeGreaterThanOrEqualTo(Short value) {
            addCriterion("ALL_CHARGE >=", value, "allCharge");
            return (Criteria) this;
        }

        public Criteria andAllChargeLessThan(Short value) {
            addCriterion("ALL_CHARGE <", value, "allCharge");
            return (Criteria) this;
        }

        public Criteria andAllChargeLessThanOrEqualTo(Short value) {
            addCriterion("ALL_CHARGE <=", value, "allCharge");
            return (Criteria) this;
        }

        public Criteria andAllChargeIn(List<Short> values) {
            addCriterion("ALL_CHARGE in", values, "allCharge");
            return (Criteria) this;
        }

        public Criteria andAllChargeNotIn(List<Short> values) {
            addCriterion("ALL_CHARGE not in", values, "allCharge");
            return (Criteria) this;
        }

        public Criteria andAllChargeBetween(Short value1, Short value2) {
            addCriterion("ALL_CHARGE between", value1, value2, "allCharge");
            return (Criteria) this;
        }

        public Criteria andAllChargeNotBetween(Short value1, Short value2) {
            addCriterion("ALL_CHARGE not between", value1, value2, "allCharge");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlIsNull() {
            addCriterion("CONSUME_LVL is null");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlIsNotNull() {
            addCriterion("CONSUME_LVL is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlEqualTo(String value) {
            addCriterion("CONSUME_LVL =", value, "consumeLvl");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlNotEqualTo(String value) {
            addCriterion("CONSUME_LVL <>", value, "consumeLvl");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlGreaterThan(String value) {
            addCriterion("CONSUME_LVL >", value, "consumeLvl");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlGreaterThanOrEqualTo(String value) {
            addCriterion("CONSUME_LVL >=", value, "consumeLvl");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlLessThan(String value) {
            addCriterion("CONSUME_LVL <", value, "consumeLvl");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlLessThanOrEqualTo(String value) {
            addCriterion("CONSUME_LVL <=", value, "consumeLvl");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlLike(String value) {
            addCriterion("CONSUME_LVL like", value, "consumeLvl");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlNotLike(String value) {
            addCriterion("CONSUME_LVL not like", value, "consumeLvl");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlIn(List<String> values) {
            addCriterion("CONSUME_LVL in", values, "consumeLvl");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlNotIn(List<String> values) {
            addCriterion("CONSUME_LVL not in", values, "consumeLvl");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlBetween(String value1, String value2) {
            addCriterion("CONSUME_LVL between", value1, value2, "consumeLvl");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlNotBetween(String value1, String value2) {
            addCriterion("CONSUME_LVL not between", value1, value2, "consumeLvl");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlDescIsNull() {
            addCriterion("CONSUME_LVL_DESC is null");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlDescIsNotNull() {
            addCriterion("CONSUME_LVL_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlDescEqualTo(String value) {
            addCriterion("CONSUME_LVL_DESC =", value, "consumeLvlDesc");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlDescNotEqualTo(String value) {
            addCriterion("CONSUME_LVL_DESC <>", value, "consumeLvlDesc");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlDescGreaterThan(String value) {
            addCriterion("CONSUME_LVL_DESC >", value, "consumeLvlDesc");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlDescGreaterThanOrEqualTo(String value) {
            addCriterion("CONSUME_LVL_DESC >=", value, "consumeLvlDesc");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlDescLessThan(String value) {
            addCriterion("CONSUME_LVL_DESC <", value, "consumeLvlDesc");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlDescLessThanOrEqualTo(String value) {
            addCriterion("CONSUME_LVL_DESC <=", value, "consumeLvlDesc");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlDescLike(String value) {
            addCriterion("CONSUME_LVL_DESC like", value, "consumeLvlDesc");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlDescNotLike(String value) {
            addCriterion("CONSUME_LVL_DESC not like", value, "consumeLvlDesc");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlDescIn(List<String> values) {
            addCriterion("CONSUME_LVL_DESC in", values, "consumeLvlDesc");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlDescNotIn(List<String> values) {
            addCriterion("CONSUME_LVL_DESC not in", values, "consumeLvlDesc");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlDescBetween(String value1, String value2) {
            addCriterion("CONSUME_LVL_DESC between", value1, value2, "consumeLvlDesc");
            return (Criteria) this;
        }

        public Criteria andConsumeLvlDescNotBetween(String value1, String value2) {
            addCriterion("CONSUME_LVL_DESC not between", value1, value2, "consumeLvlDesc");
            return (Criteria) this;
        }

        public Criteria andIsAcctUserIsNull() {
            addCriterion("IS_ACCT_USER is null");
            return (Criteria) this;
        }

        public Criteria andIsAcctUserIsNotNull() {
            addCriterion("IS_ACCT_USER is not null");
            return (Criteria) this;
        }

        public Criteria andIsAcctUserEqualTo(String value) {
            addCriterion("IS_ACCT_USER =", value, "isAcctUser");
            return (Criteria) this;
        }

        public Criteria andIsAcctUserNotEqualTo(String value) {
            addCriterion("IS_ACCT_USER <>", value, "isAcctUser");
            return (Criteria) this;
        }

        public Criteria andIsAcctUserGreaterThan(String value) {
            addCriterion("IS_ACCT_USER >", value, "isAcctUser");
            return (Criteria) this;
        }

        public Criteria andIsAcctUserGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ACCT_USER >=", value, "isAcctUser");
            return (Criteria) this;
        }

        public Criteria andIsAcctUserLessThan(String value) {
            addCriterion("IS_ACCT_USER <", value, "isAcctUser");
            return (Criteria) this;
        }

        public Criteria andIsAcctUserLessThanOrEqualTo(String value) {
            addCriterion("IS_ACCT_USER <=", value, "isAcctUser");
            return (Criteria) this;
        }

        public Criteria andIsAcctUserLike(String value) {
            addCriterion("IS_ACCT_USER like", value, "isAcctUser");
            return (Criteria) this;
        }

        public Criteria andIsAcctUserNotLike(String value) {
            addCriterion("IS_ACCT_USER not like", value, "isAcctUser");
            return (Criteria) this;
        }

        public Criteria andIsAcctUserIn(List<String> values) {
            addCriterion("IS_ACCT_USER in", values, "isAcctUser");
            return (Criteria) this;
        }

        public Criteria andIsAcctUserNotIn(List<String> values) {
            addCriterion("IS_ACCT_USER not in", values, "isAcctUser");
            return (Criteria) this;
        }

        public Criteria andIsAcctUserBetween(String value1, String value2) {
            addCriterion("IS_ACCT_USER between", value1, value2, "isAcctUser");
            return (Criteria) this;
        }

        public Criteria andIsAcctUserNotBetween(String value1, String value2) {
            addCriterion("IS_ACCT_USER not between", value1, value2, "isAcctUser");
            return (Criteria) this;
        }

        public Criteria andArpuLastMonthIsNull() {
            addCriterion("ARPU_LAST_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andArpuLastMonthIsNotNull() {
            addCriterion("ARPU_LAST_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andArpuLastMonthEqualTo(Short value) {
            addCriterion("ARPU_LAST_MONTH =", value, "arpuLastMonth");
            return (Criteria) this;
        }

        public Criteria andArpuLastMonthNotEqualTo(Short value) {
            addCriterion("ARPU_LAST_MONTH <>", value, "arpuLastMonth");
            return (Criteria) this;
        }

        public Criteria andArpuLastMonthGreaterThan(Short value) {
            addCriterion("ARPU_LAST_MONTH >", value, "arpuLastMonth");
            return (Criteria) this;
        }

        public Criteria andArpuLastMonthGreaterThanOrEqualTo(Short value) {
            addCriterion("ARPU_LAST_MONTH >=", value, "arpuLastMonth");
            return (Criteria) this;
        }

        public Criteria andArpuLastMonthLessThan(Short value) {
            addCriterion("ARPU_LAST_MONTH <", value, "arpuLastMonth");
            return (Criteria) this;
        }

        public Criteria andArpuLastMonthLessThanOrEqualTo(Short value) {
            addCriterion("ARPU_LAST_MONTH <=", value, "arpuLastMonth");
            return (Criteria) this;
        }

        public Criteria andArpuLastMonthIn(List<Short> values) {
            addCriterion("ARPU_LAST_MONTH in", values, "arpuLastMonth");
            return (Criteria) this;
        }

        public Criteria andArpuLastMonthNotIn(List<Short> values) {
            addCriterion("ARPU_LAST_MONTH not in", values, "arpuLastMonth");
            return (Criteria) this;
        }

        public Criteria andArpuLastMonthBetween(Short value1, Short value2) {
            addCriterion("ARPU_LAST_MONTH between", value1, value2, "arpuLastMonth");
            return (Criteria) this;
        }

        public Criteria andArpuLastMonthNotBetween(Short value1, Short value2) {
            addCriterion("ARPU_LAST_MONTH not between", value1, value2, "arpuLastMonth");
            return (Criteria) this;
        }

        public Criteria andArpu6monthIsNull() {
            addCriterion("ARPU_6MONTH is null");
            return (Criteria) this;
        }

        public Criteria andArpu6monthIsNotNull() {
            addCriterion("ARPU_6MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andArpu6monthEqualTo(Short value) {
            addCriterion("ARPU_6MONTH =", value, "arpu6month");
            return (Criteria) this;
        }

        public Criteria andArpu6monthNotEqualTo(Short value) {
            addCriterion("ARPU_6MONTH <>", value, "arpu6month");
            return (Criteria) this;
        }

        public Criteria andArpu6monthGreaterThan(Short value) {
            addCriterion("ARPU_6MONTH >", value, "arpu6month");
            return (Criteria) this;
        }

        public Criteria andArpu6monthGreaterThanOrEqualTo(Short value) {
            addCriterion("ARPU_6MONTH >=", value, "arpu6month");
            return (Criteria) this;
        }

        public Criteria andArpu6monthLessThan(Short value) {
            addCriterion("ARPU_6MONTH <", value, "arpu6month");
            return (Criteria) this;
        }

        public Criteria andArpu6monthLessThanOrEqualTo(Short value) {
            addCriterion("ARPU_6MONTH <=", value, "arpu6month");
            return (Criteria) this;
        }

        public Criteria andArpu6monthIn(List<Short> values) {
            addCriterion("ARPU_6MONTH in", values, "arpu6month");
            return (Criteria) this;
        }

        public Criteria andArpu6monthNotIn(List<Short> values) {
            addCriterion("ARPU_6MONTH not in", values, "arpu6month");
            return (Criteria) this;
        }

        public Criteria andArpu6monthBetween(Short value1, Short value2) {
            addCriterion("ARPU_6MONTH between", value1, value2, "arpu6month");
            return (Criteria) this;
        }

        public Criteria andArpu6monthNotBetween(Short value1, Short value2) {
            addCriterion("ARPU_6MONTH not between", value1, value2, "arpu6month");
            return (Criteria) this;
        }

        public Criteria andHighTypeIsNull() {
            addCriterion("HIGH_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andHighTypeIsNotNull() {
            addCriterion("HIGH_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andHighTypeEqualTo(String value) {
            addCriterion("HIGH_TYPE =", value, "highType");
            return (Criteria) this;
        }

        public Criteria andHighTypeNotEqualTo(String value) {
            addCriterion("HIGH_TYPE <>", value, "highType");
            return (Criteria) this;
        }

        public Criteria andHighTypeGreaterThan(String value) {
            addCriterion("HIGH_TYPE >", value, "highType");
            return (Criteria) this;
        }

        public Criteria andHighTypeGreaterThanOrEqualTo(String value) {
            addCriterion("HIGH_TYPE >=", value, "highType");
            return (Criteria) this;
        }

        public Criteria andHighTypeLessThan(String value) {
            addCriterion("HIGH_TYPE <", value, "highType");
            return (Criteria) this;
        }

        public Criteria andHighTypeLessThanOrEqualTo(String value) {
            addCriterion("HIGH_TYPE <=", value, "highType");
            return (Criteria) this;
        }

        public Criteria andHighTypeLike(String value) {
            addCriterion("HIGH_TYPE like", value, "highType");
            return (Criteria) this;
        }

        public Criteria andHighTypeNotLike(String value) {
            addCriterion("HIGH_TYPE not like", value, "highType");
            return (Criteria) this;
        }

        public Criteria andHighTypeIn(List<String> values) {
            addCriterion("HIGH_TYPE in", values, "highType");
            return (Criteria) this;
        }

        public Criteria andHighTypeNotIn(List<String> values) {
            addCriterion("HIGH_TYPE not in", values, "highType");
            return (Criteria) this;
        }

        public Criteria andHighTypeBetween(String value1, String value2) {
            addCriterion("HIGH_TYPE between", value1, value2, "highType");
            return (Criteria) this;
        }

        public Criteria andHighTypeNotBetween(String value1, String value2) {
            addCriterion("HIGH_TYPE not between", value1, value2, "highType");
            return (Criteria) this;
        }

        public Criteria andHighTypeDescIsNull() {
            addCriterion("HIGH_TYPE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andHighTypeDescIsNotNull() {
            addCriterion("HIGH_TYPE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andHighTypeDescEqualTo(String value) {
            addCriterion("HIGH_TYPE_DESC =", value, "highTypeDesc");
            return (Criteria) this;
        }

        public Criteria andHighTypeDescNotEqualTo(String value) {
            addCriterion("HIGH_TYPE_DESC <>", value, "highTypeDesc");
            return (Criteria) this;
        }

        public Criteria andHighTypeDescGreaterThan(String value) {
            addCriterion("HIGH_TYPE_DESC >", value, "highTypeDesc");
            return (Criteria) this;
        }

        public Criteria andHighTypeDescGreaterThanOrEqualTo(String value) {
            addCriterion("HIGH_TYPE_DESC >=", value, "highTypeDesc");
            return (Criteria) this;
        }

        public Criteria andHighTypeDescLessThan(String value) {
            addCriterion("HIGH_TYPE_DESC <", value, "highTypeDesc");
            return (Criteria) this;
        }

        public Criteria andHighTypeDescLessThanOrEqualTo(String value) {
            addCriterion("HIGH_TYPE_DESC <=", value, "highTypeDesc");
            return (Criteria) this;
        }

        public Criteria andHighTypeDescLike(String value) {
            addCriterion("HIGH_TYPE_DESC like", value, "highTypeDesc");
            return (Criteria) this;
        }

        public Criteria andHighTypeDescNotLike(String value) {
            addCriterion("HIGH_TYPE_DESC not like", value, "highTypeDesc");
            return (Criteria) this;
        }

        public Criteria andHighTypeDescIn(List<String> values) {
            addCriterion("HIGH_TYPE_DESC in", values, "highTypeDesc");
            return (Criteria) this;
        }

        public Criteria andHighTypeDescNotIn(List<String> values) {
            addCriterion("HIGH_TYPE_DESC not in", values, "highTypeDesc");
            return (Criteria) this;
        }

        public Criteria andHighTypeDescBetween(String value1, String value2) {
            addCriterion("HIGH_TYPE_DESC between", value1, value2, "highTypeDesc");
            return (Criteria) this;
        }

        public Criteria andHighTypeDescNotBetween(String value1, String value2) {
            addCriterion("HIGH_TYPE_DESC not between", value1, value2, "highTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNull() {
            addCriterion("CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("CARD_NO =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("CARD_NO <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("CARD_NO >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_NO >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("CARD_NO <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("CARD_NO <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("CARD_NO like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("CARD_NO not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("CARD_NO in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("CARD_NO not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("CARD_NO between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("CARD_NO not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andUserClassCodeIsNull() {
            addCriterion("USER_CLASS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUserClassCodeIsNotNull() {
            addCriterion("USER_CLASS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUserClassCodeEqualTo(String value) {
            addCriterion("USER_CLASS_CODE =", value, "userClassCode");
            return (Criteria) this;
        }

        public Criteria andUserClassCodeNotEqualTo(String value) {
            addCriterion("USER_CLASS_CODE <>", value, "userClassCode");
            return (Criteria) this;
        }

        public Criteria andUserClassCodeGreaterThan(String value) {
            addCriterion("USER_CLASS_CODE >", value, "userClassCode");
            return (Criteria) this;
        }

        public Criteria andUserClassCodeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_CLASS_CODE >=", value, "userClassCode");
            return (Criteria) this;
        }

        public Criteria andUserClassCodeLessThan(String value) {
            addCriterion("USER_CLASS_CODE <", value, "userClassCode");
            return (Criteria) this;
        }

        public Criteria andUserClassCodeLessThanOrEqualTo(String value) {
            addCriterion("USER_CLASS_CODE <=", value, "userClassCode");
            return (Criteria) this;
        }

        public Criteria andUserClassCodeLike(String value) {
            addCriterion("USER_CLASS_CODE like", value, "userClassCode");
            return (Criteria) this;
        }

        public Criteria andUserClassCodeNotLike(String value) {
            addCriterion("USER_CLASS_CODE not like", value, "userClassCode");
            return (Criteria) this;
        }

        public Criteria andUserClassCodeIn(List<String> values) {
            addCriterion("USER_CLASS_CODE in", values, "userClassCode");
            return (Criteria) this;
        }

        public Criteria andUserClassCodeNotIn(List<String> values) {
            addCriterion("USER_CLASS_CODE not in", values, "userClassCode");
            return (Criteria) this;
        }

        public Criteria andUserClassCodeBetween(String value1, String value2) {
            addCriterion("USER_CLASS_CODE between", value1, value2, "userClassCode");
            return (Criteria) this;
        }

        public Criteria andUserClassCodeNotBetween(String value1, String value2) {
            addCriterion("USER_CLASS_CODE not between", value1, value2, "userClassCode");
            return (Criteria) this;
        }

        public Criteria andUserClassIsNull() {
            addCriterion("USER_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andUserClassIsNotNull() {
            addCriterion("USER_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andUserClassEqualTo(String value) {
            addCriterion("USER_CLASS =", value, "userClass");
            return (Criteria) this;
        }

        public Criteria andUserClassNotEqualTo(String value) {
            addCriterion("USER_CLASS <>", value, "userClass");
            return (Criteria) this;
        }

        public Criteria andUserClassGreaterThan(String value) {
            addCriterion("USER_CLASS >", value, "userClass");
            return (Criteria) this;
        }

        public Criteria andUserClassGreaterThanOrEqualTo(String value) {
            addCriterion("USER_CLASS >=", value, "userClass");
            return (Criteria) this;
        }

        public Criteria andUserClassLessThan(String value) {
            addCriterion("USER_CLASS <", value, "userClass");
            return (Criteria) this;
        }

        public Criteria andUserClassLessThanOrEqualTo(String value) {
            addCriterion("USER_CLASS <=", value, "userClass");
            return (Criteria) this;
        }

        public Criteria andUserClassLike(String value) {
            addCriterion("USER_CLASS like", value, "userClass");
            return (Criteria) this;
        }

        public Criteria andUserClassNotLike(String value) {
            addCriterion("USER_CLASS not like", value, "userClass");
            return (Criteria) this;
        }

        public Criteria andUserClassIn(List<String> values) {
            addCriterion("USER_CLASS in", values, "userClass");
            return (Criteria) this;
        }

        public Criteria andUserClassNotIn(List<String> values) {
            addCriterion("USER_CLASS not in", values, "userClass");
            return (Criteria) this;
        }

        public Criteria andUserClassBetween(String value1, String value2) {
            addCriterion("USER_CLASS between", value1, value2, "userClass");
            return (Criteria) this;
        }

        public Criteria andUserClassNotBetween(String value1, String value2) {
            addCriterion("USER_CLASS not between", value1, value2, "userClass");
            return (Criteria) this;
        }

        public Criteria andEnterMonthIsNull() {
            addCriterion("ENTER_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andEnterMonthIsNotNull() {
            addCriterion("ENTER_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andEnterMonthEqualTo(String value) {
            addCriterion("ENTER_MONTH =", value, "enterMonth");
            return (Criteria) this;
        }

        public Criteria andEnterMonthNotEqualTo(String value) {
            addCriterion("ENTER_MONTH <>", value, "enterMonth");
            return (Criteria) this;
        }

        public Criteria andEnterMonthGreaterThan(String value) {
            addCriterion("ENTER_MONTH >", value, "enterMonth");
            return (Criteria) this;
        }

        public Criteria andEnterMonthGreaterThanOrEqualTo(String value) {
            addCriterion("ENTER_MONTH >=", value, "enterMonth");
            return (Criteria) this;
        }

        public Criteria andEnterMonthLessThan(String value) {
            addCriterion("ENTER_MONTH <", value, "enterMonth");
            return (Criteria) this;
        }

        public Criteria andEnterMonthLessThanOrEqualTo(String value) {
            addCriterion("ENTER_MONTH <=", value, "enterMonth");
            return (Criteria) this;
        }

        public Criteria andEnterMonthLike(String value) {
            addCriterion("ENTER_MONTH like", value, "enterMonth");
            return (Criteria) this;
        }

        public Criteria andEnterMonthNotLike(String value) {
            addCriterion("ENTER_MONTH not like", value, "enterMonth");
            return (Criteria) this;
        }

        public Criteria andEnterMonthIn(List<String> values) {
            addCriterion("ENTER_MONTH in", values, "enterMonth");
            return (Criteria) this;
        }

        public Criteria andEnterMonthNotIn(List<String> values) {
            addCriterion("ENTER_MONTH not in", values, "enterMonth");
            return (Criteria) this;
        }

        public Criteria andEnterMonthBetween(String value1, String value2) {
            addCriterion("ENTER_MONTH between", value1, value2, "enterMonth");
            return (Criteria) this;
        }

        public Criteria andEnterMonthNotBetween(String value1, String value2) {
            addCriterion("ENTER_MONTH not between", value1, value2, "enterMonth");
            return (Criteria) this;
        }

        public Criteria andUserFlagCodeIsNull() {
            addCriterion("USER_FLAG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUserFlagCodeIsNotNull() {
            addCriterion("USER_FLAG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUserFlagCodeEqualTo(String value) {
            addCriterion("USER_FLAG_CODE =", value, "userFlagCode");
            return (Criteria) this;
        }

        public Criteria andUserFlagCodeNotEqualTo(String value) {
            addCriterion("USER_FLAG_CODE <>", value, "userFlagCode");
            return (Criteria) this;
        }

        public Criteria andUserFlagCodeGreaterThan(String value) {
            addCriterion("USER_FLAG_CODE >", value, "userFlagCode");
            return (Criteria) this;
        }

        public Criteria andUserFlagCodeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_FLAG_CODE >=", value, "userFlagCode");
            return (Criteria) this;
        }

        public Criteria andUserFlagCodeLessThan(String value) {
            addCriterion("USER_FLAG_CODE <", value, "userFlagCode");
            return (Criteria) this;
        }

        public Criteria andUserFlagCodeLessThanOrEqualTo(String value) {
            addCriterion("USER_FLAG_CODE <=", value, "userFlagCode");
            return (Criteria) this;
        }

        public Criteria andUserFlagCodeLike(String value) {
            addCriterion("USER_FLAG_CODE like", value, "userFlagCode");
            return (Criteria) this;
        }

        public Criteria andUserFlagCodeNotLike(String value) {
            addCriterion("USER_FLAG_CODE not like", value, "userFlagCode");
            return (Criteria) this;
        }

        public Criteria andUserFlagCodeIn(List<String> values) {
            addCriterion("USER_FLAG_CODE in", values, "userFlagCode");
            return (Criteria) this;
        }

        public Criteria andUserFlagCodeNotIn(List<String> values) {
            addCriterion("USER_FLAG_CODE not in", values, "userFlagCode");
            return (Criteria) this;
        }

        public Criteria andUserFlagCodeBetween(String value1, String value2) {
            addCriterion("USER_FLAG_CODE between", value1, value2, "userFlagCode");
            return (Criteria) this;
        }

        public Criteria andUserFlagCodeNotBetween(String value1, String value2) {
            addCriterion("USER_FLAG_CODE not between", value1, value2, "userFlagCode");
            return (Criteria) this;
        }

        public Criteria andUserFlagIsNull() {
            addCriterion("USER_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andUserFlagIsNotNull() {
            addCriterion("USER_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andUserFlagEqualTo(String value) {
            addCriterion("USER_FLAG =", value, "userFlag");
            return (Criteria) this;
        }

        public Criteria andUserFlagNotEqualTo(String value) {
            addCriterion("USER_FLAG <>", value, "userFlag");
            return (Criteria) this;
        }

        public Criteria andUserFlagGreaterThan(String value) {
            addCriterion("USER_FLAG >", value, "userFlag");
            return (Criteria) this;
        }

        public Criteria andUserFlagGreaterThanOrEqualTo(String value) {
            addCriterion("USER_FLAG >=", value, "userFlag");
            return (Criteria) this;
        }

        public Criteria andUserFlagLessThan(String value) {
            addCriterion("USER_FLAG <", value, "userFlag");
            return (Criteria) this;
        }

        public Criteria andUserFlagLessThanOrEqualTo(String value) {
            addCriterion("USER_FLAG <=", value, "userFlag");
            return (Criteria) this;
        }

        public Criteria andUserFlagLike(String value) {
            addCriterion("USER_FLAG like", value, "userFlag");
            return (Criteria) this;
        }

        public Criteria andUserFlagNotLike(String value) {
            addCriterion("USER_FLAG not like", value, "userFlag");
            return (Criteria) this;
        }

        public Criteria andUserFlagIn(List<String> values) {
            addCriterion("USER_FLAG in", values, "userFlag");
            return (Criteria) this;
        }

        public Criteria andUserFlagNotIn(List<String> values) {
            addCriterion("USER_FLAG not in", values, "userFlag");
            return (Criteria) this;
        }

        public Criteria andUserFlagBetween(String value1, String value2) {
            addCriterion("USER_FLAG between", value1, value2, "userFlag");
            return (Criteria) this;
        }

        public Criteria andUserFlagNotBetween(String value1, String value2) {
            addCriterion("USER_FLAG not between", value1, value2, "userFlag");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagCodeIsNull() {
            addCriterion("LAST_USER_FLAG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagCodeIsNotNull() {
            addCriterion("LAST_USER_FLAG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagCodeEqualTo(String value) {
            addCriterion("LAST_USER_FLAG_CODE =", value, "lastUserFlagCode");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagCodeNotEqualTo(String value) {
            addCriterion("LAST_USER_FLAG_CODE <>", value, "lastUserFlagCode");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagCodeGreaterThan(String value) {
            addCriterion("LAST_USER_FLAG_CODE >", value, "lastUserFlagCode");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagCodeGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_USER_FLAG_CODE >=", value, "lastUserFlagCode");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagCodeLessThan(String value) {
            addCriterion("LAST_USER_FLAG_CODE <", value, "lastUserFlagCode");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagCodeLessThanOrEqualTo(String value) {
            addCriterion("LAST_USER_FLAG_CODE <=", value, "lastUserFlagCode");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagCodeLike(String value) {
            addCriterion("LAST_USER_FLAG_CODE like", value, "lastUserFlagCode");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagCodeNotLike(String value) {
            addCriterion("LAST_USER_FLAG_CODE not like", value, "lastUserFlagCode");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagCodeIn(List<String> values) {
            addCriterion("LAST_USER_FLAG_CODE in", values, "lastUserFlagCode");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagCodeNotIn(List<String> values) {
            addCriterion("LAST_USER_FLAG_CODE not in", values, "lastUserFlagCode");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagCodeBetween(String value1, String value2) {
            addCriterion("LAST_USER_FLAG_CODE between", value1, value2, "lastUserFlagCode");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagCodeNotBetween(String value1, String value2) {
            addCriterion("LAST_USER_FLAG_CODE not between", value1, value2, "lastUserFlagCode");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagIsNull() {
            addCriterion("LAST_USER_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagIsNotNull() {
            addCriterion("LAST_USER_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagEqualTo(String value) {
            addCriterion("LAST_USER_FLAG =", value, "lastUserFlag");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagNotEqualTo(String value) {
            addCriterion("LAST_USER_FLAG <>", value, "lastUserFlag");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagGreaterThan(String value) {
            addCriterion("LAST_USER_FLAG >", value, "lastUserFlag");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_USER_FLAG >=", value, "lastUserFlag");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagLessThan(String value) {
            addCriterion("LAST_USER_FLAG <", value, "lastUserFlag");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagLessThanOrEqualTo(String value) {
            addCriterion("LAST_USER_FLAG <=", value, "lastUserFlag");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagLike(String value) {
            addCriterion("LAST_USER_FLAG like", value, "lastUserFlag");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagNotLike(String value) {
            addCriterion("LAST_USER_FLAG not like", value, "lastUserFlag");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagIn(List<String> values) {
            addCriterion("LAST_USER_FLAG in", values, "lastUserFlag");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagNotIn(List<String> values) {
            addCriterion("LAST_USER_FLAG not in", values, "lastUserFlag");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagBetween(String value1, String value2) {
            addCriterion("LAST_USER_FLAG between", value1, value2, "lastUserFlag");
            return (Criteria) this;
        }

        public Criteria andLastUserFlagNotBetween(String value1, String value2) {
            addCriterion("LAST_USER_FLAG not between", value1, value2, "lastUserFlag");
            return (Criteria) this;
        }

        public Criteria andUserStarClassCodeIsNull() {
            addCriterion("USER_STAR_CLASS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUserStarClassCodeIsNotNull() {
            addCriterion("USER_STAR_CLASS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUserStarClassCodeEqualTo(String value) {
            addCriterion("USER_STAR_CLASS_CODE =", value, "userStarClassCode");
            return (Criteria) this;
        }

        public Criteria andUserStarClassCodeNotEqualTo(String value) {
            addCriterion("USER_STAR_CLASS_CODE <>", value, "userStarClassCode");
            return (Criteria) this;
        }

        public Criteria andUserStarClassCodeGreaterThan(String value) {
            addCriterion("USER_STAR_CLASS_CODE >", value, "userStarClassCode");
            return (Criteria) this;
        }

        public Criteria andUserStarClassCodeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_STAR_CLASS_CODE >=", value, "userStarClassCode");
            return (Criteria) this;
        }

        public Criteria andUserStarClassCodeLessThan(String value) {
            addCriterion("USER_STAR_CLASS_CODE <", value, "userStarClassCode");
            return (Criteria) this;
        }

        public Criteria andUserStarClassCodeLessThanOrEqualTo(String value) {
            addCriterion("USER_STAR_CLASS_CODE <=", value, "userStarClassCode");
            return (Criteria) this;
        }

        public Criteria andUserStarClassCodeLike(String value) {
            addCriterion("USER_STAR_CLASS_CODE like", value, "userStarClassCode");
            return (Criteria) this;
        }

        public Criteria andUserStarClassCodeNotLike(String value) {
            addCriterion("USER_STAR_CLASS_CODE not like", value, "userStarClassCode");
            return (Criteria) this;
        }

        public Criteria andUserStarClassCodeIn(List<String> values) {
            addCriterion("USER_STAR_CLASS_CODE in", values, "userStarClassCode");
            return (Criteria) this;
        }

        public Criteria andUserStarClassCodeNotIn(List<String> values) {
            addCriterion("USER_STAR_CLASS_CODE not in", values, "userStarClassCode");
            return (Criteria) this;
        }

        public Criteria andUserStarClassCodeBetween(String value1, String value2) {
            addCriterion("USER_STAR_CLASS_CODE between", value1, value2, "userStarClassCode");
            return (Criteria) this;
        }

        public Criteria andUserStarClassCodeNotBetween(String value1, String value2) {
            addCriterion("USER_STAR_CLASS_CODE not between", value1, value2, "userStarClassCode");
            return (Criteria) this;
        }

        public Criteria andUserStarClassIsNull() {
            addCriterion("USER_STAR_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andUserStarClassIsNotNull() {
            addCriterion("USER_STAR_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andUserStarClassEqualTo(String value) {
            addCriterion("USER_STAR_CLASS =", value, "userStarClass");
            return (Criteria) this;
        }

        public Criteria andUserStarClassNotEqualTo(String value) {
            addCriterion("USER_STAR_CLASS <>", value, "userStarClass");
            return (Criteria) this;
        }

        public Criteria andUserStarClassGreaterThan(String value) {
            addCriterion("USER_STAR_CLASS >", value, "userStarClass");
            return (Criteria) this;
        }

        public Criteria andUserStarClassGreaterThanOrEqualTo(String value) {
            addCriterion("USER_STAR_CLASS >=", value, "userStarClass");
            return (Criteria) this;
        }

        public Criteria andUserStarClassLessThan(String value) {
            addCriterion("USER_STAR_CLASS <", value, "userStarClass");
            return (Criteria) this;
        }

        public Criteria andUserStarClassLessThanOrEqualTo(String value) {
            addCriterion("USER_STAR_CLASS <=", value, "userStarClass");
            return (Criteria) this;
        }

        public Criteria andUserStarClassLike(String value) {
            addCriterion("USER_STAR_CLASS like", value, "userStarClass");
            return (Criteria) this;
        }

        public Criteria andUserStarClassNotLike(String value) {
            addCriterion("USER_STAR_CLASS not like", value, "userStarClass");
            return (Criteria) this;
        }

        public Criteria andUserStarClassIn(List<String> values) {
            addCriterion("USER_STAR_CLASS in", values, "userStarClass");
            return (Criteria) this;
        }

        public Criteria andUserStarClassNotIn(List<String> values) {
            addCriterion("USER_STAR_CLASS not in", values, "userStarClass");
            return (Criteria) this;
        }

        public Criteria andUserStarClassBetween(String value1, String value2) {
            addCriterion("USER_STAR_CLASS between", value1, value2, "userStarClass");
            return (Criteria) this;
        }

        public Criteria andUserStarClassNotBetween(String value1, String value2) {
            addCriterion("USER_STAR_CLASS not between", value1, value2, "userStarClass");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyCodeIsNull() {
            addCriterion("USER_LOYALTY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyCodeIsNotNull() {
            addCriterion("USER_LOYALTY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyCodeEqualTo(String value) {
            addCriterion("USER_LOYALTY_CODE =", value, "userLoyaltyCode");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyCodeNotEqualTo(String value) {
            addCriterion("USER_LOYALTY_CODE <>", value, "userLoyaltyCode");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyCodeGreaterThan(String value) {
            addCriterion("USER_LOYALTY_CODE >", value, "userLoyaltyCode");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_LOYALTY_CODE >=", value, "userLoyaltyCode");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyCodeLessThan(String value) {
            addCriterion("USER_LOYALTY_CODE <", value, "userLoyaltyCode");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyCodeLessThanOrEqualTo(String value) {
            addCriterion("USER_LOYALTY_CODE <=", value, "userLoyaltyCode");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyCodeLike(String value) {
            addCriterion("USER_LOYALTY_CODE like", value, "userLoyaltyCode");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyCodeNotLike(String value) {
            addCriterion("USER_LOYALTY_CODE not like", value, "userLoyaltyCode");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyCodeIn(List<String> values) {
            addCriterion("USER_LOYALTY_CODE in", values, "userLoyaltyCode");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyCodeNotIn(List<String> values) {
            addCriterion("USER_LOYALTY_CODE not in", values, "userLoyaltyCode");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyCodeBetween(String value1, String value2) {
            addCriterion("USER_LOYALTY_CODE between", value1, value2, "userLoyaltyCode");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyCodeNotBetween(String value1, String value2) {
            addCriterion("USER_LOYALTY_CODE not between", value1, value2, "userLoyaltyCode");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyIsNull() {
            addCriterion("USER_LOYALTY is null");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyIsNotNull() {
            addCriterion("USER_LOYALTY is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyEqualTo(String value) {
            addCriterion("USER_LOYALTY =", value, "userLoyalty");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyNotEqualTo(String value) {
            addCriterion("USER_LOYALTY <>", value, "userLoyalty");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyGreaterThan(String value) {
            addCriterion("USER_LOYALTY >", value, "userLoyalty");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyGreaterThanOrEqualTo(String value) {
            addCriterion("USER_LOYALTY >=", value, "userLoyalty");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyLessThan(String value) {
            addCriterion("USER_LOYALTY <", value, "userLoyalty");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyLessThanOrEqualTo(String value) {
            addCriterion("USER_LOYALTY <=", value, "userLoyalty");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyLike(String value) {
            addCriterion("USER_LOYALTY like", value, "userLoyalty");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyNotLike(String value) {
            addCriterion("USER_LOYALTY not like", value, "userLoyalty");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyIn(List<String> values) {
            addCriterion("USER_LOYALTY in", values, "userLoyalty");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyNotIn(List<String> values) {
            addCriterion("USER_LOYALTY not in", values, "userLoyalty");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyBetween(String value1, String value2) {
            addCriterion("USER_LOYALTY between", value1, value2, "userLoyalty");
            return (Criteria) this;
        }

        public Criteria andUserLoyaltyNotBetween(String value1, String value2) {
            addCriterion("USER_LOYALTY not between", value1, value2, "userLoyalty");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagCodeIsNull() {
            addCriterion("OWE_FEE_FLAG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagCodeIsNotNull() {
            addCriterion("OWE_FEE_FLAG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagCodeEqualTo(String value) {
            addCriterion("OWE_FEE_FLAG_CODE =", value, "oweFeeFlagCode");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagCodeNotEqualTo(String value) {
            addCriterion("OWE_FEE_FLAG_CODE <>", value, "oweFeeFlagCode");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagCodeGreaterThan(String value) {
            addCriterion("OWE_FEE_FLAG_CODE >", value, "oweFeeFlagCode");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagCodeGreaterThanOrEqualTo(String value) {
            addCriterion("OWE_FEE_FLAG_CODE >=", value, "oweFeeFlagCode");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagCodeLessThan(String value) {
            addCriterion("OWE_FEE_FLAG_CODE <", value, "oweFeeFlagCode");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagCodeLessThanOrEqualTo(String value) {
            addCriterion("OWE_FEE_FLAG_CODE <=", value, "oweFeeFlagCode");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagCodeLike(String value) {
            addCriterion("OWE_FEE_FLAG_CODE like", value, "oweFeeFlagCode");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagCodeNotLike(String value) {
            addCriterion("OWE_FEE_FLAG_CODE not like", value, "oweFeeFlagCode");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagCodeIn(List<String> values) {
            addCriterion("OWE_FEE_FLAG_CODE in", values, "oweFeeFlagCode");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagCodeNotIn(List<String> values) {
            addCriterion("OWE_FEE_FLAG_CODE not in", values, "oweFeeFlagCode");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagCodeBetween(String value1, String value2) {
            addCriterion("OWE_FEE_FLAG_CODE between", value1, value2, "oweFeeFlagCode");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagCodeNotBetween(String value1, String value2) {
            addCriterion("OWE_FEE_FLAG_CODE not between", value1, value2, "oweFeeFlagCode");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagIsNull() {
            addCriterion("OWE_FEE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagIsNotNull() {
            addCriterion("OWE_FEE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagEqualTo(String value) {
            addCriterion("OWE_FEE_FLAG =", value, "oweFeeFlag");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagNotEqualTo(String value) {
            addCriterion("OWE_FEE_FLAG <>", value, "oweFeeFlag");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagGreaterThan(String value) {
            addCriterion("OWE_FEE_FLAG >", value, "oweFeeFlag");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagGreaterThanOrEqualTo(String value) {
            addCriterion("OWE_FEE_FLAG >=", value, "oweFeeFlag");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagLessThan(String value) {
            addCriterion("OWE_FEE_FLAG <", value, "oweFeeFlag");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagLessThanOrEqualTo(String value) {
            addCriterion("OWE_FEE_FLAG <=", value, "oweFeeFlag");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagLike(String value) {
            addCriterion("OWE_FEE_FLAG like", value, "oweFeeFlag");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagNotLike(String value) {
            addCriterion("OWE_FEE_FLAG not like", value, "oweFeeFlag");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagIn(List<String> values) {
            addCriterion("OWE_FEE_FLAG in", values, "oweFeeFlag");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagNotIn(List<String> values) {
            addCriterion("OWE_FEE_FLAG not in", values, "oweFeeFlag");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagBetween(String value1, String value2) {
            addCriterion("OWE_FEE_FLAG between", value1, value2, "oweFeeFlag");
            return (Criteria) this;
        }

        public Criteria andOweFeeFlagNotBetween(String value1, String value2) {
            addCriterion("OWE_FEE_FLAG not between", value1, value2, "oweFeeFlag");
            return (Criteria) this;
        }

        public Criteria andUserStageCodeIsNull() {
            addCriterion("USER_STAGE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUserStageCodeIsNotNull() {
            addCriterion("USER_STAGE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUserStageCodeEqualTo(String value) {
            addCriterion("USER_STAGE_CODE =", value, "userStageCode");
            return (Criteria) this;
        }

        public Criteria andUserStageCodeNotEqualTo(String value) {
            addCriterion("USER_STAGE_CODE <>", value, "userStageCode");
            return (Criteria) this;
        }

        public Criteria andUserStageCodeGreaterThan(String value) {
            addCriterion("USER_STAGE_CODE >", value, "userStageCode");
            return (Criteria) this;
        }

        public Criteria andUserStageCodeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_STAGE_CODE >=", value, "userStageCode");
            return (Criteria) this;
        }

        public Criteria andUserStageCodeLessThan(String value) {
            addCriterion("USER_STAGE_CODE <", value, "userStageCode");
            return (Criteria) this;
        }

        public Criteria andUserStageCodeLessThanOrEqualTo(String value) {
            addCriterion("USER_STAGE_CODE <=", value, "userStageCode");
            return (Criteria) this;
        }

        public Criteria andUserStageCodeLike(String value) {
            addCriterion("USER_STAGE_CODE like", value, "userStageCode");
            return (Criteria) this;
        }

        public Criteria andUserStageCodeNotLike(String value) {
            addCriterion("USER_STAGE_CODE not like", value, "userStageCode");
            return (Criteria) this;
        }

        public Criteria andUserStageCodeIn(List<String> values) {
            addCriterion("USER_STAGE_CODE in", values, "userStageCode");
            return (Criteria) this;
        }

        public Criteria andUserStageCodeNotIn(List<String> values) {
            addCriterion("USER_STAGE_CODE not in", values, "userStageCode");
            return (Criteria) this;
        }

        public Criteria andUserStageCodeBetween(String value1, String value2) {
            addCriterion("USER_STAGE_CODE between", value1, value2, "userStageCode");
            return (Criteria) this;
        }

        public Criteria andUserStageCodeNotBetween(String value1, String value2) {
            addCriterion("USER_STAGE_CODE not between", value1, value2, "userStageCode");
            return (Criteria) this;
        }

        public Criteria andUserStageIsNull() {
            addCriterion("USER_STAGE is null");
            return (Criteria) this;
        }

        public Criteria andUserStageIsNotNull() {
            addCriterion("USER_STAGE is not null");
            return (Criteria) this;
        }

        public Criteria andUserStageEqualTo(String value) {
            addCriterion("USER_STAGE =", value, "userStage");
            return (Criteria) this;
        }

        public Criteria andUserStageNotEqualTo(String value) {
            addCriterion("USER_STAGE <>", value, "userStage");
            return (Criteria) this;
        }

        public Criteria andUserStageGreaterThan(String value) {
            addCriterion("USER_STAGE >", value, "userStage");
            return (Criteria) this;
        }

        public Criteria andUserStageGreaterThanOrEqualTo(String value) {
            addCriterion("USER_STAGE >=", value, "userStage");
            return (Criteria) this;
        }

        public Criteria andUserStageLessThan(String value) {
            addCriterion("USER_STAGE <", value, "userStage");
            return (Criteria) this;
        }

        public Criteria andUserStageLessThanOrEqualTo(String value) {
            addCriterion("USER_STAGE <=", value, "userStage");
            return (Criteria) this;
        }

        public Criteria andUserStageLike(String value) {
            addCriterion("USER_STAGE like", value, "userStage");
            return (Criteria) this;
        }

        public Criteria andUserStageNotLike(String value) {
            addCriterion("USER_STAGE not like", value, "userStage");
            return (Criteria) this;
        }

        public Criteria andUserStageIn(List<String> values) {
            addCriterion("USER_STAGE in", values, "userStage");
            return (Criteria) this;
        }

        public Criteria andUserStageNotIn(List<String> values) {
            addCriterion("USER_STAGE not in", values, "userStage");
            return (Criteria) this;
        }

        public Criteria andUserStageBetween(String value1, String value2) {
            addCriterion("USER_STAGE between", value1, value2, "userStage");
            return (Criteria) this;
        }

        public Criteria andUserStageNotBetween(String value1, String value2) {
            addCriterion("USER_STAGE not between", value1, value2, "userStage");
            return (Criteria) this;
        }

        public Criteria andStatusChangeCodeIsNull() {
            addCriterion("STATUS_CHANGE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andStatusChangeCodeIsNotNull() {
            addCriterion("STATUS_CHANGE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andStatusChangeCodeEqualTo(String value) {
            addCriterion("STATUS_CHANGE_CODE =", value, "statusChangeCode");
            return (Criteria) this;
        }

        public Criteria andStatusChangeCodeNotEqualTo(String value) {
            addCriterion("STATUS_CHANGE_CODE <>", value, "statusChangeCode");
            return (Criteria) this;
        }

        public Criteria andStatusChangeCodeGreaterThan(String value) {
            addCriterion("STATUS_CHANGE_CODE >", value, "statusChangeCode");
            return (Criteria) this;
        }

        public Criteria andStatusChangeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS_CHANGE_CODE >=", value, "statusChangeCode");
            return (Criteria) this;
        }

        public Criteria andStatusChangeCodeLessThan(String value) {
            addCriterion("STATUS_CHANGE_CODE <", value, "statusChangeCode");
            return (Criteria) this;
        }

        public Criteria andStatusChangeCodeLessThanOrEqualTo(String value) {
            addCriterion("STATUS_CHANGE_CODE <=", value, "statusChangeCode");
            return (Criteria) this;
        }

        public Criteria andStatusChangeCodeLike(String value) {
            addCriterion("STATUS_CHANGE_CODE like", value, "statusChangeCode");
            return (Criteria) this;
        }

        public Criteria andStatusChangeCodeNotLike(String value) {
            addCriterion("STATUS_CHANGE_CODE not like", value, "statusChangeCode");
            return (Criteria) this;
        }

        public Criteria andStatusChangeCodeIn(List<String> values) {
            addCriterion("STATUS_CHANGE_CODE in", values, "statusChangeCode");
            return (Criteria) this;
        }

        public Criteria andStatusChangeCodeNotIn(List<String> values) {
            addCriterion("STATUS_CHANGE_CODE not in", values, "statusChangeCode");
            return (Criteria) this;
        }

        public Criteria andStatusChangeCodeBetween(String value1, String value2) {
            addCriterion("STATUS_CHANGE_CODE between", value1, value2, "statusChangeCode");
            return (Criteria) this;
        }

        public Criteria andStatusChangeCodeNotBetween(String value1, String value2) {
            addCriterion("STATUS_CHANGE_CODE not between", value1, value2, "statusChangeCode");
            return (Criteria) this;
        }

        public Criteria andStatusChangeIsNull() {
            addCriterion("STATUS_CHANGE is null");
            return (Criteria) this;
        }

        public Criteria andStatusChangeIsNotNull() {
            addCriterion("STATUS_CHANGE is not null");
            return (Criteria) this;
        }

        public Criteria andStatusChangeEqualTo(String value) {
            addCriterion("STATUS_CHANGE =", value, "statusChange");
            return (Criteria) this;
        }

        public Criteria andStatusChangeNotEqualTo(String value) {
            addCriterion("STATUS_CHANGE <>", value, "statusChange");
            return (Criteria) this;
        }

        public Criteria andStatusChangeGreaterThan(String value) {
            addCriterion("STATUS_CHANGE >", value, "statusChange");
            return (Criteria) this;
        }

        public Criteria andStatusChangeGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS_CHANGE >=", value, "statusChange");
            return (Criteria) this;
        }

        public Criteria andStatusChangeLessThan(String value) {
            addCriterion("STATUS_CHANGE <", value, "statusChange");
            return (Criteria) this;
        }

        public Criteria andStatusChangeLessThanOrEqualTo(String value) {
            addCriterion("STATUS_CHANGE <=", value, "statusChange");
            return (Criteria) this;
        }

        public Criteria andStatusChangeLike(String value) {
            addCriterion("STATUS_CHANGE like", value, "statusChange");
            return (Criteria) this;
        }

        public Criteria andStatusChangeNotLike(String value) {
            addCriterion("STATUS_CHANGE not like", value, "statusChange");
            return (Criteria) this;
        }

        public Criteria andStatusChangeIn(List<String> values) {
            addCriterion("STATUS_CHANGE in", values, "statusChange");
            return (Criteria) this;
        }

        public Criteria andStatusChangeNotIn(List<String> values) {
            addCriterion("STATUS_CHANGE not in", values, "statusChange");
            return (Criteria) this;
        }

        public Criteria andStatusChangeBetween(String value1, String value2) {
            addCriterion("STATUS_CHANGE between", value1, value2, "statusChange");
            return (Criteria) this;
        }

        public Criteria andStatusChangeNotBetween(String value1, String value2) {
            addCriterion("STATUS_CHANGE not between", value1, value2, "statusChange");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("IS_VALID is null");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("IS_VALID is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidEqualTo(String value) {
            addCriterion("IS_VALID =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(String value) {
            addCriterion("IS_VALID <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(String value) {
            addCriterion("IS_VALID >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(String value) {
            addCriterion("IS_VALID >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(String value) {
            addCriterion("IS_VALID <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(String value) {
            addCriterion("IS_VALID <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLike(String value) {
            addCriterion("IS_VALID like", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotLike(String value) {
            addCriterion("IS_VALID not like", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<String> values) {
            addCriterion("IS_VALID in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<String> values) {
            addCriterion("IS_VALID not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(String value1, String value2) {
            addCriterion("IS_VALID between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(String value1, String value2) {
            addCriterion("IS_VALID not between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andSexCodeIsNull() {
            addCriterion("SEX_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSexCodeIsNotNull() {
            addCriterion("SEX_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSexCodeEqualTo(String value) {
            addCriterion("SEX_CODE =", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeNotEqualTo(String value) {
            addCriterion("SEX_CODE <>", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeGreaterThan(String value) {
            addCriterion("SEX_CODE >", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SEX_CODE >=", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeLessThan(String value) {
            addCriterion("SEX_CODE <", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeLessThanOrEqualTo(String value) {
            addCriterion("SEX_CODE <=", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeLike(String value) {
            addCriterion("SEX_CODE like", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeNotLike(String value) {
            addCriterion("SEX_CODE not like", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeIn(List<String> values) {
            addCriterion("SEX_CODE in", values, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeNotIn(List<String> values) {
            addCriterion("SEX_CODE not in", values, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeBetween(String value1, String value2) {
            addCriterion("SEX_CODE between", value1, value2, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeNotBetween(String value1, String value2) {
            addCriterion("SEX_CODE not between", value1, value2, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("AGE is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("AGE is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Short value) {
            addCriterion("AGE =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Short value) {
            addCriterion("AGE <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Short value) {
            addCriterion("AGE >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Short value) {
            addCriterion("AGE >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Short value) {
            addCriterion("AGE <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Short value) {
            addCriterion("AGE <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Short> values) {
            addCriterion("AGE in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Short> values) {
            addCriterion("AGE not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Short value1, Short value2) {
            addCriterion("AGE between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Short value1, Short value2) {
            addCriterion("AGE not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNull() {
            addCriterion("ID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("ID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(String value) {
            addCriterion("ID_TYPE =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(String value) {
            addCriterion("ID_TYPE <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(String value) {
            addCriterion("ID_TYPE >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ID_TYPE >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(String value) {
            addCriterion("ID_TYPE <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(String value) {
            addCriterion("ID_TYPE <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLike(String value) {
            addCriterion("ID_TYPE like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotLike(String value) {
            addCriterion("ID_TYPE not like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<String> values) {
            addCriterion("ID_TYPE in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<String> values) {
            addCriterion("ID_TYPE not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(String value1, String value2) {
            addCriterion("ID_TYPE between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(String value1, String value2) {
            addCriterion("ID_TYPE not between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNull() {
            addCriterion("ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNotNull() {
            addCriterion("ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoEqualTo(String value) {
            addCriterion("ID_NO =", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotEqualTo(String value) {
            addCriterion("ID_NO <>", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThan(String value) {
            addCriterion("ID_NO >", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NO >=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThan(String value) {
            addCriterion("ID_NO <", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThanOrEqualTo(String value) {
            addCriterion("ID_NO <=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLike(String value) {
            addCriterion("ID_NO like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotLike(String value) {
            addCriterion("ID_NO not like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoIn(List<String> values) {
            addCriterion("ID_NO in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotIn(List<String> values) {
            addCriterion("ID_NO not in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoBetween(String value1, String value2) {
            addCriterion("ID_NO between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotBetween(String value1, String value2) {
            addCriterion("ID_NO not between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdIsValidIsNull() {
            addCriterion("ID_IS_VALID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsValidIsNotNull() {
            addCriterion("ID_IS_VALID is not null");
            return (Criteria) this;
        }

        public Criteria andIdIsValidEqualTo(String value) {
            addCriterion("ID_IS_VALID =", value, "idIsValid");
            return (Criteria) this;
        }

        public Criteria andIdIsValidNotEqualTo(String value) {
            addCriterion("ID_IS_VALID <>", value, "idIsValid");
            return (Criteria) this;
        }

        public Criteria andIdIsValidGreaterThan(String value) {
            addCriterion("ID_IS_VALID >", value, "idIsValid");
            return (Criteria) this;
        }

        public Criteria andIdIsValidGreaterThanOrEqualTo(String value) {
            addCriterion("ID_IS_VALID >=", value, "idIsValid");
            return (Criteria) this;
        }

        public Criteria andIdIsValidLessThan(String value) {
            addCriterion("ID_IS_VALID <", value, "idIsValid");
            return (Criteria) this;
        }

        public Criteria andIdIsValidLessThanOrEqualTo(String value) {
            addCriterion("ID_IS_VALID <=", value, "idIsValid");
            return (Criteria) this;
        }

        public Criteria andIdIsValidLike(String value) {
            addCriterion("ID_IS_VALID like", value, "idIsValid");
            return (Criteria) this;
        }

        public Criteria andIdIsValidNotLike(String value) {
            addCriterion("ID_IS_VALID not like", value, "idIsValid");
            return (Criteria) this;
        }

        public Criteria andIdIsValidIn(List<String> values) {
            addCriterion("ID_IS_VALID in", values, "idIsValid");
            return (Criteria) this;
        }

        public Criteria andIdIsValidNotIn(List<String> values) {
            addCriterion("ID_IS_VALID not in", values, "idIsValid");
            return (Criteria) this;
        }

        public Criteria andIdIsValidBetween(String value1, String value2) {
            addCriterion("ID_IS_VALID between", value1, value2, "idIsValid");
            return (Criteria) this;
        }

        public Criteria andIdIsValidNotBetween(String value1, String value2) {
            addCriterion("ID_IS_VALID not between", value1, value2, "idIsValid");
            return (Criteria) this;
        }

        public Criteria andDeviceCountIsNull() {
            addCriterion("DEVICE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andDeviceCountIsNotNull() {
            addCriterion("DEVICE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceCountEqualTo(Short value) {
            addCriterion("DEVICE_COUNT =", value, "deviceCount");
            return (Criteria) this;
        }

        public Criteria andDeviceCountNotEqualTo(Short value) {
            addCriterion("DEVICE_COUNT <>", value, "deviceCount");
            return (Criteria) this;
        }

        public Criteria andDeviceCountGreaterThan(Short value) {
            addCriterion("DEVICE_COUNT >", value, "deviceCount");
            return (Criteria) this;
        }

        public Criteria andDeviceCountGreaterThanOrEqualTo(Short value) {
            addCriterion("DEVICE_COUNT >=", value, "deviceCount");
            return (Criteria) this;
        }

        public Criteria andDeviceCountLessThan(Short value) {
            addCriterion("DEVICE_COUNT <", value, "deviceCount");
            return (Criteria) this;
        }

        public Criteria andDeviceCountLessThanOrEqualTo(Short value) {
            addCriterion("DEVICE_COUNT <=", value, "deviceCount");
            return (Criteria) this;
        }

        public Criteria andDeviceCountIn(List<Short> values) {
            addCriterion("DEVICE_COUNT in", values, "deviceCount");
            return (Criteria) this;
        }

        public Criteria andDeviceCountNotIn(List<Short> values) {
            addCriterion("DEVICE_COUNT not in", values, "deviceCount");
            return (Criteria) this;
        }

        public Criteria andDeviceCountBetween(Short value1, Short value2) {
            addCriterion("DEVICE_COUNT between", value1, value2, "deviceCount");
            return (Criteria) this;
        }

        public Criteria andDeviceCountNotBetween(Short value1, Short value2) {
            addCriterion("DEVICE_COUNT not between", value1, value2, "deviceCount");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNull() {
            addCriterion("POST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNotNull() {
            addCriterion("POST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodeEqualTo(String value) {
            addCriterion("POST_CODE =", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotEqualTo(String value) {
            addCriterion("POST_CODE <>", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThan(String value) {
            addCriterion("POST_CODE >", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("POST_CODE >=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThan(String value) {
            addCriterion("POST_CODE <", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThanOrEqualTo(String value) {
            addCriterion("POST_CODE <=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLike(String value) {
            addCriterion("POST_CODE like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotLike(String value) {
            addCriterion("POST_CODE not like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIn(List<String> values) {
            addCriterion("POST_CODE in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotIn(List<String> values) {
            addCriterion("POST_CODE not in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeBetween(String value1, String value2) {
            addCriterion("POST_CODE between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotBetween(String value1, String value2) {
            addCriterion("POST_CODE not between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andContactPersonIsNull() {
            addCriterion("CONTACT_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andContactPersonIsNotNull() {
            addCriterion("CONTACT_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andContactPersonEqualTo(String value) {
            addCriterion("CONTACT_PERSON =", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotEqualTo(String value) {
            addCriterion("CONTACT_PERSON <>", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonGreaterThan(String value) {
            addCriterion("CONTACT_PERSON >", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_PERSON >=", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLessThan(String value) {
            addCriterion("CONTACT_PERSON <", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_PERSON <=", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLike(String value) {
            addCriterion("CONTACT_PERSON like", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotLike(String value) {
            addCriterion("CONTACT_PERSON not like", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonIn(List<String> values) {
            addCriterion("CONTACT_PERSON in", values, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotIn(List<String> values) {
            addCriterion("CONTACT_PERSON not in", values, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonBetween(String value1, String value2) {
            addCriterion("CONTACT_PERSON between", value1, value2, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotBetween(String value1, String value2) {
            addCriterion("CONTACT_PERSON not between", value1, value2, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactTelIsNull() {
            addCriterion("CONTACT_TEL is null");
            return (Criteria) this;
        }

        public Criteria andContactTelIsNotNull() {
            addCriterion("CONTACT_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andContactTelEqualTo(String value) {
            addCriterion("CONTACT_TEL =", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotEqualTo(String value) {
            addCriterion("CONTACT_TEL <>", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelGreaterThan(String value) {
            addCriterion("CONTACT_TEL >", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_TEL >=", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLessThan(String value) {
            addCriterion("CONTACT_TEL <", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_TEL <=", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLike(String value) {
            addCriterion("CONTACT_TEL like", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotLike(String value) {
            addCriterion("CONTACT_TEL not like", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelIn(List<String> values) {
            addCriterion("CONTACT_TEL in", values, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotIn(List<String> values) {
            addCriterion("CONTACT_TEL not in", values, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelBetween(String value1, String value2) {
            addCriterion("CONTACT_TEL between", value1, value2, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotBetween(String value1, String value2) {
            addCriterion("CONTACT_TEL not between", value1, value2, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactAddressIsNull() {
            addCriterion("CONTACT_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andContactAddressIsNotNull() {
            addCriterion("CONTACT_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andContactAddressEqualTo(String value) {
            addCriterion("CONTACT_ADDRESS =", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotEqualTo(String value) {
            addCriterion("CONTACT_ADDRESS <>", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressGreaterThan(String value) {
            addCriterion("CONTACT_ADDRESS >", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_ADDRESS >=", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLessThan(String value) {
            addCriterion("CONTACT_ADDRESS <", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_ADDRESS <=", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLike(String value) {
            addCriterion("CONTACT_ADDRESS like", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotLike(String value) {
            addCriterion("CONTACT_ADDRESS not like", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressIn(List<String> values) {
            addCriterion("CONTACT_ADDRESS in", values, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotIn(List<String> values) {
            addCriterion("CONTACT_ADDRESS not in", values, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressBetween(String value1, String value2) {
            addCriterion("CONTACT_ADDRESS between", value1, value2, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotBetween(String value1, String value2) {
            addCriterion("CONTACT_ADDRESS not between", value1, value2, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andEMailAddressIsNull() {
            addCriterion("E_MAIL_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andEMailAddressIsNotNull() {
            addCriterion("E_MAIL_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andEMailAddressEqualTo(String value) {
            addCriterion("E_MAIL_ADDRESS =", value, "eMailAddress");
            return (Criteria) this;
        }

        public Criteria andEMailAddressNotEqualTo(String value) {
            addCriterion("E_MAIL_ADDRESS <>", value, "eMailAddress");
            return (Criteria) this;
        }

        public Criteria andEMailAddressGreaterThan(String value) {
            addCriterion("E_MAIL_ADDRESS >", value, "eMailAddress");
            return (Criteria) this;
        }

        public Criteria andEMailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("E_MAIL_ADDRESS >=", value, "eMailAddress");
            return (Criteria) this;
        }

        public Criteria andEMailAddressLessThan(String value) {
            addCriterion("E_MAIL_ADDRESS <", value, "eMailAddress");
            return (Criteria) this;
        }

        public Criteria andEMailAddressLessThanOrEqualTo(String value) {
            addCriterion("E_MAIL_ADDRESS <=", value, "eMailAddress");
            return (Criteria) this;
        }

        public Criteria andEMailAddressLike(String value) {
            addCriterion("E_MAIL_ADDRESS like", value, "eMailAddress");
            return (Criteria) this;
        }

        public Criteria andEMailAddressNotLike(String value) {
            addCriterion("E_MAIL_ADDRESS not like", value, "eMailAddress");
            return (Criteria) this;
        }

        public Criteria andEMailAddressIn(List<String> values) {
            addCriterion("E_MAIL_ADDRESS in", values, "eMailAddress");
            return (Criteria) this;
        }

        public Criteria andEMailAddressNotIn(List<String> values) {
            addCriterion("E_MAIL_ADDRESS not in", values, "eMailAddress");
            return (Criteria) this;
        }

        public Criteria andEMailAddressBetween(String value1, String value2) {
            addCriterion("E_MAIL_ADDRESS between", value1, value2, "eMailAddress");
            return (Criteria) this;
        }

        public Criteria andEMailAddressNotBetween(String value1, String value2) {
            addCriterion("E_MAIL_ADDRESS not between", value1, value2, "eMailAddress");
            return (Criteria) this;
        }

        public Criteria andValidContactTypeIsNull() {
            addCriterion("VALID_CONTACT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andValidContactTypeIsNotNull() {
            addCriterion("VALID_CONTACT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andValidContactTypeEqualTo(String value) {
            addCriterion("VALID_CONTACT_TYPE =", value, "validContactType");
            return (Criteria) this;
        }

        public Criteria andValidContactTypeNotEqualTo(String value) {
            addCriterion("VALID_CONTACT_TYPE <>", value, "validContactType");
            return (Criteria) this;
        }

        public Criteria andValidContactTypeGreaterThan(String value) {
            addCriterion("VALID_CONTACT_TYPE >", value, "validContactType");
            return (Criteria) this;
        }

        public Criteria andValidContactTypeGreaterThanOrEqualTo(String value) {
            addCriterion("VALID_CONTACT_TYPE >=", value, "validContactType");
            return (Criteria) this;
        }

        public Criteria andValidContactTypeLessThan(String value) {
            addCriterion("VALID_CONTACT_TYPE <", value, "validContactType");
            return (Criteria) this;
        }

        public Criteria andValidContactTypeLessThanOrEqualTo(String value) {
            addCriterion("VALID_CONTACT_TYPE <=", value, "validContactType");
            return (Criteria) this;
        }

        public Criteria andValidContactTypeLike(String value) {
            addCriterion("VALID_CONTACT_TYPE like", value, "validContactType");
            return (Criteria) this;
        }

        public Criteria andValidContactTypeNotLike(String value) {
            addCriterion("VALID_CONTACT_TYPE not like", value, "validContactType");
            return (Criteria) this;
        }

        public Criteria andValidContactTypeIn(List<String> values) {
            addCriterion("VALID_CONTACT_TYPE in", values, "validContactType");
            return (Criteria) this;
        }

        public Criteria andValidContactTypeNotIn(List<String> values) {
            addCriterion("VALID_CONTACT_TYPE not in", values, "validContactType");
            return (Criteria) this;
        }

        public Criteria andValidContactTypeBetween(String value1, String value2) {
            addCriterion("VALID_CONTACT_TYPE between", value1, value2, "validContactType");
            return (Criteria) this;
        }

        public Criteria andValidContactTypeNotBetween(String value1, String value2) {
            addCriterion("VALID_CONTACT_TYPE not between", value1, value2, "validContactType");
            return (Criteria) this;
        }

        public Criteria andOperNoIsNull() {
            addCriterion("OPER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOperNoIsNotNull() {
            addCriterion("OPER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOperNoEqualTo(String value) {
            addCriterion("OPER_NO =", value, "operNo");
            return (Criteria) this;
        }

        public Criteria andOperNoNotEqualTo(String value) {
            addCriterion("OPER_NO <>", value, "operNo");
            return (Criteria) this;
        }

        public Criteria andOperNoGreaterThan(String value) {
            addCriterion("OPER_NO >", value, "operNo");
            return (Criteria) this;
        }

        public Criteria andOperNoGreaterThanOrEqualTo(String value) {
            addCriterion("OPER_NO >=", value, "operNo");
            return (Criteria) this;
        }

        public Criteria andOperNoLessThan(String value) {
            addCriterion("OPER_NO <", value, "operNo");
            return (Criteria) this;
        }

        public Criteria andOperNoLessThanOrEqualTo(String value) {
            addCriterion("OPER_NO <=", value, "operNo");
            return (Criteria) this;
        }

        public Criteria andOperNoLike(String value) {
            addCriterion("OPER_NO like", value, "operNo");
            return (Criteria) this;
        }

        public Criteria andOperNoNotLike(String value) {
            addCriterion("OPER_NO not like", value, "operNo");
            return (Criteria) this;
        }

        public Criteria andOperNoIn(List<String> values) {
            addCriterion("OPER_NO in", values, "operNo");
            return (Criteria) this;
        }

        public Criteria andOperNoNotIn(List<String> values) {
            addCriterion("OPER_NO not in", values, "operNo");
            return (Criteria) this;
        }

        public Criteria andOperNoBetween(String value1, String value2) {
            addCriterion("OPER_NO between", value1, value2, "operNo");
            return (Criteria) this;
        }

        public Criteria andOperNoNotBetween(String value1, String value2) {
            addCriterion("OPER_NO not between", value1, value2, "operNo");
            return (Criteria) this;
        }

        public Criteria andOldOperNoIsNull() {
            addCriterion("OLD_OPER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOldOperNoIsNotNull() {
            addCriterion("OLD_OPER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOldOperNoEqualTo(String value) {
            addCriterion("OLD_OPER_NO =", value, "oldOperNo");
            return (Criteria) this;
        }

        public Criteria andOldOperNoNotEqualTo(String value) {
            addCriterion("OLD_OPER_NO <>", value, "oldOperNo");
            return (Criteria) this;
        }

        public Criteria andOldOperNoGreaterThan(String value) {
            addCriterion("OLD_OPER_NO >", value, "oldOperNo");
            return (Criteria) this;
        }

        public Criteria andOldOperNoGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_OPER_NO >=", value, "oldOperNo");
            return (Criteria) this;
        }

        public Criteria andOldOperNoLessThan(String value) {
            addCriterion("OLD_OPER_NO <", value, "oldOperNo");
            return (Criteria) this;
        }

        public Criteria andOldOperNoLessThanOrEqualTo(String value) {
            addCriterion("OLD_OPER_NO <=", value, "oldOperNo");
            return (Criteria) this;
        }

        public Criteria andOldOperNoLike(String value) {
            addCriterion("OLD_OPER_NO like", value, "oldOperNo");
            return (Criteria) this;
        }

        public Criteria andOldOperNoNotLike(String value) {
            addCriterion("OLD_OPER_NO not like", value, "oldOperNo");
            return (Criteria) this;
        }

        public Criteria andOldOperNoIn(List<String> values) {
            addCriterion("OLD_OPER_NO in", values, "oldOperNo");
            return (Criteria) this;
        }

        public Criteria andOldOperNoNotIn(List<String> values) {
            addCriterion("OLD_OPER_NO not in", values, "oldOperNo");
            return (Criteria) this;
        }

        public Criteria andOldOperNoBetween(String value1, String value2) {
            addCriterion("OLD_OPER_NO between", value1, value2, "oldOperNo");
            return (Criteria) this;
        }

        public Criteria andOldOperNoNotBetween(String value1, String value2) {
            addCriterion("OLD_OPER_NO not between", value1, value2, "oldOperNo");
            return (Criteria) this;
        }

        public Criteria andAcctUserClassIsNull() {
            addCriterion("ACCT_USER_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andAcctUserClassIsNotNull() {
            addCriterion("ACCT_USER_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andAcctUserClassEqualTo(String value) {
            addCriterion("ACCT_USER_CLASS =", value, "acctUserClass");
            return (Criteria) this;
        }

        public Criteria andAcctUserClassNotEqualTo(String value) {
            addCriterion("ACCT_USER_CLASS <>", value, "acctUserClass");
            return (Criteria) this;
        }

        public Criteria andAcctUserClassGreaterThan(String value) {
            addCriterion("ACCT_USER_CLASS >", value, "acctUserClass");
            return (Criteria) this;
        }

        public Criteria andAcctUserClassGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_USER_CLASS >=", value, "acctUserClass");
            return (Criteria) this;
        }

        public Criteria andAcctUserClassLessThan(String value) {
            addCriterion("ACCT_USER_CLASS <", value, "acctUserClass");
            return (Criteria) this;
        }

        public Criteria andAcctUserClassLessThanOrEqualTo(String value) {
            addCriterion("ACCT_USER_CLASS <=", value, "acctUserClass");
            return (Criteria) this;
        }

        public Criteria andAcctUserClassLike(String value) {
            addCriterion("ACCT_USER_CLASS like", value, "acctUserClass");
            return (Criteria) this;
        }

        public Criteria andAcctUserClassNotLike(String value) {
            addCriterion("ACCT_USER_CLASS not like", value, "acctUserClass");
            return (Criteria) this;
        }

        public Criteria andAcctUserClassIn(List<String> values) {
            addCriterion("ACCT_USER_CLASS in", values, "acctUserClass");
            return (Criteria) this;
        }

        public Criteria andAcctUserClassNotIn(List<String> values) {
            addCriterion("ACCT_USER_CLASS not in", values, "acctUserClass");
            return (Criteria) this;
        }

        public Criteria andAcctUserClassBetween(String value1, String value2) {
            addCriterion("ACCT_USER_CLASS between", value1, value2, "acctUserClass");
            return (Criteria) this;
        }

        public Criteria andAcctUserClassNotBetween(String value1, String value2) {
            addCriterion("ACCT_USER_CLASS not between", value1, value2, "acctUserClass");
            return (Criteria) this;
        }

        public Criteria andInGroupDateIsNull() {
            addCriterion("IN_GROUP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInGroupDateIsNotNull() {
            addCriterion("IN_GROUP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInGroupDateEqualTo(Date value) {
            addCriterion("IN_GROUP_DATE =", value, "inGroupDate");
            return (Criteria) this;
        }

        public Criteria andInGroupDateNotEqualTo(Date value) {
            addCriterion("IN_GROUP_DATE <>", value, "inGroupDate");
            return (Criteria) this;
        }

        public Criteria andInGroupDateGreaterThan(Date value) {
            addCriterion("IN_GROUP_DATE >", value, "inGroupDate");
            return (Criteria) this;
        }

        public Criteria andInGroupDateGreaterThanOrEqualTo(Date value) {
            addCriterion("IN_GROUP_DATE >=", value, "inGroupDate");
            return (Criteria) this;
        }

        public Criteria andInGroupDateLessThan(Date value) {
            addCriterion("IN_GROUP_DATE <", value, "inGroupDate");
            return (Criteria) this;
        }

        public Criteria andInGroupDateLessThanOrEqualTo(Date value) {
            addCriterion("IN_GROUP_DATE <=", value, "inGroupDate");
            return (Criteria) this;
        }

        public Criteria andInGroupDateIn(List<Date> values) {
            addCriterion("IN_GROUP_DATE in", values, "inGroupDate");
            return (Criteria) this;
        }

        public Criteria andInGroupDateNotIn(List<Date> values) {
            addCriterion("IN_GROUP_DATE not in", values, "inGroupDate");
            return (Criteria) this;
        }

        public Criteria andInGroupDateBetween(Date value1, Date value2) {
            addCriterion("IN_GROUP_DATE between", value1, value2, "inGroupDate");
            return (Criteria) this;
        }

        public Criteria andInGroupDateNotBetween(Date value1, Date value2) {
            addCriterion("IN_GROUP_DATE not between", value1, value2, "inGroupDate");
            return (Criteria) this;
        }

        public Criteria andQuitGroupDateIsNull() {
            addCriterion("QUIT_GROUP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andQuitGroupDateIsNotNull() {
            addCriterion("QUIT_GROUP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andQuitGroupDateEqualTo(String value) {
            addCriterion("QUIT_GROUP_DATE =", value, "quitGroupDate");
            return (Criteria) this;
        }

        public Criteria andQuitGroupDateNotEqualTo(String value) {
            addCriterion("QUIT_GROUP_DATE <>", value, "quitGroupDate");
            return (Criteria) this;
        }

        public Criteria andQuitGroupDateGreaterThan(String value) {
            addCriterion("QUIT_GROUP_DATE >", value, "quitGroupDate");
            return (Criteria) this;
        }

        public Criteria andQuitGroupDateGreaterThanOrEqualTo(String value) {
            addCriterion("QUIT_GROUP_DATE >=", value, "quitGroupDate");
            return (Criteria) this;
        }

        public Criteria andQuitGroupDateLessThan(String value) {
            addCriterion("QUIT_GROUP_DATE <", value, "quitGroupDate");
            return (Criteria) this;
        }

        public Criteria andQuitGroupDateLessThanOrEqualTo(String value) {
            addCriterion("QUIT_GROUP_DATE <=", value, "quitGroupDate");
            return (Criteria) this;
        }

        public Criteria andQuitGroupDateLike(String value) {
            addCriterion("QUIT_GROUP_DATE like", value, "quitGroupDate");
            return (Criteria) this;
        }

        public Criteria andQuitGroupDateNotLike(String value) {
            addCriterion("QUIT_GROUP_DATE not like", value, "quitGroupDate");
            return (Criteria) this;
        }

        public Criteria andQuitGroupDateIn(List<String> values) {
            addCriterion("QUIT_GROUP_DATE in", values, "quitGroupDate");
            return (Criteria) this;
        }

        public Criteria andQuitGroupDateNotIn(List<String> values) {
            addCriterion("QUIT_GROUP_DATE not in", values, "quitGroupDate");
            return (Criteria) this;
        }

        public Criteria andQuitGroupDateBetween(String value1, String value2) {
            addCriterion("QUIT_GROUP_DATE between", value1, value2, "quitGroupDate");
            return (Criteria) this;
        }

        public Criteria andQuitGroupDateNotBetween(String value1, String value2) {
            addCriterion("QUIT_GROUP_DATE not between", value1, value2, "quitGroupDate");
            return (Criteria) this;
        }

        public Criteria andVpnNoIsNull() {
            addCriterion("VPN_NO is null");
            return (Criteria) this;
        }

        public Criteria andVpnNoIsNotNull() {
            addCriterion("VPN_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVpnNoEqualTo(String value) {
            addCriterion("VPN_NO =", value, "vpnNo");
            return (Criteria) this;
        }

        public Criteria andVpnNoNotEqualTo(String value) {
            addCriterion("VPN_NO <>", value, "vpnNo");
            return (Criteria) this;
        }

        public Criteria andVpnNoGreaterThan(String value) {
            addCriterion("VPN_NO >", value, "vpnNo");
            return (Criteria) this;
        }

        public Criteria andVpnNoGreaterThanOrEqualTo(String value) {
            addCriterion("VPN_NO >=", value, "vpnNo");
            return (Criteria) this;
        }

        public Criteria andVpnNoLessThan(String value) {
            addCriterion("VPN_NO <", value, "vpnNo");
            return (Criteria) this;
        }

        public Criteria andVpnNoLessThanOrEqualTo(String value) {
            addCriterion("VPN_NO <=", value, "vpnNo");
            return (Criteria) this;
        }

        public Criteria andVpnNoLike(String value) {
            addCriterion("VPN_NO like", value, "vpnNo");
            return (Criteria) this;
        }

        public Criteria andVpnNoNotLike(String value) {
            addCriterion("VPN_NO not like", value, "vpnNo");
            return (Criteria) this;
        }

        public Criteria andVpnNoIn(List<String> values) {
            addCriterion("VPN_NO in", values, "vpnNo");
            return (Criteria) this;
        }

        public Criteria andVpnNoNotIn(List<String> values) {
            addCriterion("VPN_NO not in", values, "vpnNo");
            return (Criteria) this;
        }

        public Criteria andVpnNoBetween(String value1, String value2) {
            addCriterion("VPN_NO between", value1, value2, "vpnNo");
            return (Criteria) this;
        }

        public Criteria andVpnNoNotBetween(String value1, String value2) {
            addCriterion("VPN_NO not between", value1, value2, "vpnNo");
            return (Criteria) this;
        }

        public Criteria andDevelopIdIsNull() {
            addCriterion("DEVELOP_ID is null");
            return (Criteria) this;
        }

        public Criteria andDevelopIdIsNotNull() {
            addCriterion("DEVELOP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopIdEqualTo(String value) {
            addCriterion("DEVELOP_ID =", value, "developId");
            return (Criteria) this;
        }

        public Criteria andDevelopIdNotEqualTo(String value) {
            addCriterion("DEVELOP_ID <>", value, "developId");
            return (Criteria) this;
        }

        public Criteria andDevelopIdGreaterThan(String value) {
            addCriterion("DEVELOP_ID >", value, "developId");
            return (Criteria) this;
        }

        public Criteria andDevelopIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEVELOP_ID >=", value, "developId");
            return (Criteria) this;
        }

        public Criteria andDevelopIdLessThan(String value) {
            addCriterion("DEVELOP_ID <", value, "developId");
            return (Criteria) this;
        }

        public Criteria andDevelopIdLessThanOrEqualTo(String value) {
            addCriterion("DEVELOP_ID <=", value, "developId");
            return (Criteria) this;
        }

        public Criteria andDevelopIdLike(String value) {
            addCriterion("DEVELOP_ID like", value, "developId");
            return (Criteria) this;
        }

        public Criteria andDevelopIdNotLike(String value) {
            addCriterion("DEVELOP_ID not like", value, "developId");
            return (Criteria) this;
        }

        public Criteria andDevelopIdIn(List<String> values) {
            addCriterion("DEVELOP_ID in", values, "developId");
            return (Criteria) this;
        }

        public Criteria andDevelopIdNotIn(List<String> values) {
            addCriterion("DEVELOP_ID not in", values, "developId");
            return (Criteria) this;
        }

        public Criteria andDevelopIdBetween(String value1, String value2) {
            addCriterion("DEVELOP_ID between", value1, value2, "developId");
            return (Criteria) this;
        }

        public Criteria andDevelopIdNotBetween(String value1, String value2) {
            addCriterion("DEVELOP_ID not between", value1, value2, "developId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIsNull() {
            addCriterion("DEVELOPER is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIsNotNull() {
            addCriterion("DEVELOPER is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperEqualTo(String value) {
            addCriterion("DEVELOPER =", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotEqualTo(String value) {
            addCriterion("DEVELOPER <>", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThan(String value) {
            addCriterion("DEVELOPER >", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThanOrEqualTo(String value) {
            addCriterion("DEVELOPER >=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThan(String value) {
            addCriterion("DEVELOPER <", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThanOrEqualTo(String value) {
            addCriterion("DEVELOPER <=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLike(String value) {
            addCriterion("DEVELOPER like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotLike(String value) {
            addCriterion("DEVELOPER not like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperIn(List<String> values) {
            addCriterion("DEVELOPER in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotIn(List<String> values) {
            addCriterion("DEVELOPER not in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperBetween(String value1, String value2) {
            addCriterion("DEVELOPER between", value1, value2, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotBetween(String value1, String value2) {
            addCriterion("DEVELOPER not between", value1, value2, "developer");
            return (Criteria) this;
        }

        public Criteria andDevelopPhoneIsNull() {
            addCriterion("DEVELOP_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andDevelopPhoneIsNotNull() {
            addCriterion("DEVELOP_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopPhoneEqualTo(String value) {
            addCriterion("DEVELOP_PHONE =", value, "developPhone");
            return (Criteria) this;
        }

        public Criteria andDevelopPhoneNotEqualTo(String value) {
            addCriterion("DEVELOP_PHONE <>", value, "developPhone");
            return (Criteria) this;
        }

        public Criteria andDevelopPhoneGreaterThan(String value) {
            addCriterion("DEVELOP_PHONE >", value, "developPhone");
            return (Criteria) this;
        }

        public Criteria andDevelopPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("DEVELOP_PHONE >=", value, "developPhone");
            return (Criteria) this;
        }

        public Criteria andDevelopPhoneLessThan(String value) {
            addCriterion("DEVELOP_PHONE <", value, "developPhone");
            return (Criteria) this;
        }

        public Criteria andDevelopPhoneLessThanOrEqualTo(String value) {
            addCriterion("DEVELOP_PHONE <=", value, "developPhone");
            return (Criteria) this;
        }

        public Criteria andDevelopPhoneLike(String value) {
            addCriterion("DEVELOP_PHONE like", value, "developPhone");
            return (Criteria) this;
        }

        public Criteria andDevelopPhoneNotLike(String value) {
            addCriterion("DEVELOP_PHONE not like", value, "developPhone");
            return (Criteria) this;
        }

        public Criteria andDevelopPhoneIn(List<String> values) {
            addCriterion("DEVELOP_PHONE in", values, "developPhone");
            return (Criteria) this;
        }

        public Criteria andDevelopPhoneNotIn(List<String> values) {
            addCriterion("DEVELOP_PHONE not in", values, "developPhone");
            return (Criteria) this;
        }

        public Criteria andDevelopPhoneBetween(String value1, String value2) {
            addCriterion("DEVELOP_PHONE between", value1, value2, "developPhone");
            return (Criteria) this;
        }

        public Criteria andDevelopPhoneNotBetween(String value1, String value2) {
            addCriterion("DEVELOP_PHONE not between", value1, value2, "developPhone");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNull() {
            addCriterion("PAY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNotNull() {
            addCriterion("PAY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPayDateEqualTo(Date value) {
            addCriterion("PAY_DATE =", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotEqualTo(Date value) {
            addCriterion("PAY_DATE <>", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThan(Date value) {
            addCriterion("PAY_DATE >", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PAY_DATE >=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThan(Date value) {
            addCriterion("PAY_DATE <", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThanOrEqualTo(Date value) {
            addCriterion("PAY_DATE <=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateIn(List<Date> values) {
            addCriterion("PAY_DATE in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotIn(List<Date> values) {
            addCriterion("PAY_DATE not in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateBetween(Date value1, Date value2) {
            addCriterion("PAY_DATE between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotBetween(Date value1, Date value2) {
            addCriterion("PAY_DATE not between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIsNull() {
            addCriterion("PAY_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIsNotNull() {
            addCriterion("PAY_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andPayMoneyEqualTo(String value) {
            addCriterion("PAY_MONEY =", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotEqualTo(String value) {
            addCriterion("PAY_MONEY <>", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyGreaterThan(String value) {
            addCriterion("PAY_MONEY >", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_MONEY >=", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyLessThan(String value) {
            addCriterion("PAY_MONEY <", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyLessThanOrEqualTo(String value) {
            addCriterion("PAY_MONEY <=", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyLike(String value) {
            addCriterion("PAY_MONEY like", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotLike(String value) {
            addCriterion("PAY_MONEY not like", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIn(List<String> values) {
            addCriterion("PAY_MONEY in", values, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotIn(List<String> values) {
            addCriterion("PAY_MONEY not in", values, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyBetween(String value1, String value2) {
            addCriterion("PAY_MONEY between", value1, value2, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotBetween(String value1, String value2) {
            addCriterion("PAY_MONEY not between", value1, value2, "payMoney");
            return (Criteria) this;
        }

        public Criteria andG3fIsNull() {
            addCriterion("G3F is null");
            return (Criteria) this;
        }

        public Criteria andG3fIsNotNull() {
            addCriterion("G3F is not null");
            return (Criteria) this;
        }

        public Criteria andG3fEqualTo(String value) {
            addCriterion("G3F =", value, "g3f");
            return (Criteria) this;
        }

        public Criteria andG3fNotEqualTo(String value) {
            addCriterion("G3F <>", value, "g3f");
            return (Criteria) this;
        }

        public Criteria andG3fGreaterThan(String value) {
            addCriterion("G3F >", value, "g3f");
            return (Criteria) this;
        }

        public Criteria andG3fGreaterThanOrEqualTo(String value) {
            addCriterion("G3F >=", value, "g3f");
            return (Criteria) this;
        }

        public Criteria andG3fLessThan(String value) {
            addCriterion("G3F <", value, "g3f");
            return (Criteria) this;
        }

        public Criteria andG3fLessThanOrEqualTo(String value) {
            addCriterion("G3F <=", value, "g3f");
            return (Criteria) this;
        }

        public Criteria andG3fLike(String value) {
            addCriterion("G3F like", value, "g3f");
            return (Criteria) this;
        }

        public Criteria andG3fNotLike(String value) {
            addCriterion("G3F not like", value, "g3f");
            return (Criteria) this;
        }

        public Criteria andG3fIn(List<String> values) {
            addCriterion("G3F in", values, "g3f");
            return (Criteria) this;
        }

        public Criteria andG3fNotIn(List<String> values) {
            addCriterion("G3F not in", values, "g3f");
            return (Criteria) this;
        }

        public Criteria andG3fBetween(String value1, String value2) {
            addCriterion("G3F between", value1, value2, "g3f");
            return (Criteria) this;
        }

        public Criteria andG3fNotBetween(String value1, String value2) {
            addCriterion("G3F not between", value1, value2, "g3f");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andLastLvlIsNull() {
            addCriterion("LAST_LVL is null");
            return (Criteria) this;
        }

        public Criteria andLastLvlIsNotNull() {
            addCriterion("LAST_LVL is not null");
            return (Criteria) this;
        }

        public Criteria andLastLvlEqualTo(String value) {
            addCriterion("LAST_LVL =", value, "lastLvl");
            return (Criteria) this;
        }

        public Criteria andLastLvlNotEqualTo(String value) {
            addCriterion("LAST_LVL <>", value, "lastLvl");
            return (Criteria) this;
        }

        public Criteria andLastLvlGreaterThan(String value) {
            addCriterion("LAST_LVL >", value, "lastLvl");
            return (Criteria) this;
        }

        public Criteria andLastLvlGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_LVL >=", value, "lastLvl");
            return (Criteria) this;
        }

        public Criteria andLastLvlLessThan(String value) {
            addCriterion("LAST_LVL <", value, "lastLvl");
            return (Criteria) this;
        }

        public Criteria andLastLvlLessThanOrEqualTo(String value) {
            addCriterion("LAST_LVL <=", value, "lastLvl");
            return (Criteria) this;
        }

        public Criteria andLastLvlLike(String value) {
            addCriterion("LAST_LVL like", value, "lastLvl");
            return (Criteria) this;
        }

        public Criteria andLastLvlNotLike(String value) {
            addCriterion("LAST_LVL not like", value, "lastLvl");
            return (Criteria) this;
        }

        public Criteria andLastLvlIn(List<String> values) {
            addCriterion("LAST_LVL in", values, "lastLvl");
            return (Criteria) this;
        }

        public Criteria andLastLvlNotIn(List<String> values) {
            addCriterion("LAST_LVL not in", values, "lastLvl");
            return (Criteria) this;
        }

        public Criteria andLastLvlBetween(String value1, String value2) {
            addCriterion("LAST_LVL between", value1, value2, "lastLvl");
            return (Criteria) this;
        }

        public Criteria andLastLvlNotBetween(String value1, String value2) {
            addCriterion("LAST_LVL not between", value1, value2, "lastLvl");
            return (Criteria) this;
        }

        public Criteria andOweFlagIsNull() {
            addCriterion("OWE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andOweFlagIsNotNull() {
            addCriterion("OWE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andOweFlagEqualTo(String value) {
            addCriterion("OWE_FLAG =", value, "oweFlag");
            return (Criteria) this;
        }

        public Criteria andOweFlagNotEqualTo(String value) {
            addCriterion("OWE_FLAG <>", value, "oweFlag");
            return (Criteria) this;
        }

        public Criteria andOweFlagGreaterThan(String value) {
            addCriterion("OWE_FLAG >", value, "oweFlag");
            return (Criteria) this;
        }

        public Criteria andOweFlagGreaterThanOrEqualTo(String value) {
            addCriterion("OWE_FLAG >=", value, "oweFlag");
            return (Criteria) this;
        }

        public Criteria andOweFlagLessThan(String value) {
            addCriterion("OWE_FLAG <", value, "oweFlag");
            return (Criteria) this;
        }

        public Criteria andOweFlagLessThanOrEqualTo(String value) {
            addCriterion("OWE_FLAG <=", value, "oweFlag");
            return (Criteria) this;
        }

        public Criteria andOweFlagLike(String value) {
            addCriterion("OWE_FLAG like", value, "oweFlag");
            return (Criteria) this;
        }

        public Criteria andOweFlagNotLike(String value) {
            addCriterion("OWE_FLAG not like", value, "oweFlag");
            return (Criteria) this;
        }

        public Criteria andOweFlagIn(List<String> values) {
            addCriterion("OWE_FLAG in", values, "oweFlag");
            return (Criteria) this;
        }

        public Criteria andOweFlagNotIn(List<String> values) {
            addCriterion("OWE_FLAG not in", values, "oweFlag");
            return (Criteria) this;
        }

        public Criteria andOweFlagBetween(String value1, String value2) {
            addCriterion("OWE_FLAG between", value1, value2, "oweFlag");
            return (Criteria) this;
        }

        public Criteria andOweFlagNotBetween(String value1, String value2) {
            addCriterion("OWE_FLAG not between", value1, value2, "oweFlag");
            return (Criteria) this;
        }

        public Criteria andAssessDateIsNull() {
            addCriterion("ASSESS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAssessDateIsNotNull() {
            addCriterion("ASSESS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAssessDateEqualTo(Date value) {
            addCriterion("ASSESS_DATE =", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateNotEqualTo(Date value) {
            addCriterion("ASSESS_DATE <>", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateGreaterThan(Date value) {
            addCriterion("ASSESS_DATE >", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ASSESS_DATE >=", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateLessThan(Date value) {
            addCriterion("ASSESS_DATE <", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateLessThanOrEqualTo(Date value) {
            addCriterion("ASSESS_DATE <=", value, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateIn(List<Date> values) {
            addCriterion("ASSESS_DATE in", values, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateNotIn(List<Date> values) {
            addCriterion("ASSESS_DATE not in", values, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateBetween(Date value1, Date value2) {
            addCriterion("ASSESS_DATE between", value1, value2, "assessDate");
            return (Criteria) this;
        }

        public Criteria andAssessDateNotBetween(Date value1, Date value2) {
            addCriterion("ASSESS_DATE not between", value1, value2, "assessDate");
            return (Criteria) this;
        }

        public Criteria andDevelopNoIsNull() {
            addCriterion("DEVELOP_NO is null");
            return (Criteria) this;
        }

        public Criteria andDevelopNoIsNotNull() {
            addCriterion("DEVELOP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopNoEqualTo(String value) {
            addCriterion("DEVELOP_NO =", value, "developNo");
            return (Criteria) this;
        }

        public Criteria andDevelopNoNotEqualTo(String value) {
            addCriterion("DEVELOP_NO <>", value, "developNo");
            return (Criteria) this;
        }

        public Criteria andDevelopNoGreaterThan(String value) {
            addCriterion("DEVELOP_NO >", value, "developNo");
            return (Criteria) this;
        }

        public Criteria andDevelopNoGreaterThanOrEqualTo(String value) {
            addCriterion("DEVELOP_NO >=", value, "developNo");
            return (Criteria) this;
        }

        public Criteria andDevelopNoLessThan(String value) {
            addCriterion("DEVELOP_NO <", value, "developNo");
            return (Criteria) this;
        }

        public Criteria andDevelopNoLessThanOrEqualTo(String value) {
            addCriterion("DEVELOP_NO <=", value, "developNo");
            return (Criteria) this;
        }

        public Criteria andDevelopNoLike(String value) {
            addCriterion("DEVELOP_NO like", value, "developNo");
            return (Criteria) this;
        }

        public Criteria andDevelopNoNotLike(String value) {
            addCriterion("DEVELOP_NO not like", value, "developNo");
            return (Criteria) this;
        }

        public Criteria andDevelopNoIn(List<String> values) {
            addCriterion("DEVELOP_NO in", values, "developNo");
            return (Criteria) this;
        }

        public Criteria andDevelopNoNotIn(List<String> values) {
            addCriterion("DEVELOP_NO not in", values, "developNo");
            return (Criteria) this;
        }

        public Criteria andDevelopNoBetween(String value1, String value2) {
            addCriterion("DEVELOP_NO between", value1, value2, "developNo");
            return (Criteria) this;
        }

        public Criteria andDevelopNoNotBetween(String value1, String value2) {
            addCriterion("DEVELOP_NO not between", value1, value2, "developNo");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelNoIsNull() {
            addCriterion("DEVELOP_CHANNEL_NO is null");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelNoIsNotNull() {
            addCriterion("DEVELOP_CHANNEL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelNoEqualTo(String value) {
            addCriterion("DEVELOP_CHANNEL_NO =", value, "developChannelNo");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelNoNotEqualTo(String value) {
            addCriterion("DEVELOP_CHANNEL_NO <>", value, "developChannelNo");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelNoGreaterThan(String value) {
            addCriterion("DEVELOP_CHANNEL_NO >", value, "developChannelNo");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelNoGreaterThanOrEqualTo(String value) {
            addCriterion("DEVELOP_CHANNEL_NO >=", value, "developChannelNo");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelNoLessThan(String value) {
            addCriterion("DEVELOP_CHANNEL_NO <", value, "developChannelNo");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelNoLessThanOrEqualTo(String value) {
            addCriterion("DEVELOP_CHANNEL_NO <=", value, "developChannelNo");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelNoLike(String value) {
            addCriterion("DEVELOP_CHANNEL_NO like", value, "developChannelNo");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelNoNotLike(String value) {
            addCriterion("DEVELOP_CHANNEL_NO not like", value, "developChannelNo");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelNoIn(List<String> values) {
            addCriterion("DEVELOP_CHANNEL_NO in", values, "developChannelNo");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelNoNotIn(List<String> values) {
            addCriterion("DEVELOP_CHANNEL_NO not in", values, "developChannelNo");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelNoBetween(String value1, String value2) {
            addCriterion("DEVELOP_CHANNEL_NO between", value1, value2, "developChannelNo");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelNoNotBetween(String value1, String value2) {
            addCriterion("DEVELOP_CHANNEL_NO not between", value1, value2, "developChannelNo");
            return (Criteria) this;
        }

        public Criteria andInnetDurationIsNull() {
            addCriterion("INNET_DURATION is null");
            return (Criteria) this;
        }

        public Criteria andInnetDurationIsNotNull() {
            addCriterion("INNET_DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andInnetDurationEqualTo(String value) {
            addCriterion("INNET_DURATION =", value, "innetDuration");
            return (Criteria) this;
        }

        public Criteria andInnetDurationNotEqualTo(String value) {
            addCriterion("INNET_DURATION <>", value, "innetDuration");
            return (Criteria) this;
        }

        public Criteria andInnetDurationGreaterThan(String value) {
            addCriterion("INNET_DURATION >", value, "innetDuration");
            return (Criteria) this;
        }

        public Criteria andInnetDurationGreaterThanOrEqualTo(String value) {
            addCriterion("INNET_DURATION >=", value, "innetDuration");
            return (Criteria) this;
        }

        public Criteria andInnetDurationLessThan(String value) {
            addCriterion("INNET_DURATION <", value, "innetDuration");
            return (Criteria) this;
        }

        public Criteria andInnetDurationLessThanOrEqualTo(String value) {
            addCriterion("INNET_DURATION <=", value, "innetDuration");
            return (Criteria) this;
        }

        public Criteria andInnetDurationLike(String value) {
            addCriterion("INNET_DURATION like", value, "innetDuration");
            return (Criteria) this;
        }

        public Criteria andInnetDurationNotLike(String value) {
            addCriterion("INNET_DURATION not like", value, "innetDuration");
            return (Criteria) this;
        }

        public Criteria andInnetDurationIn(List<String> values) {
            addCriterion("INNET_DURATION in", values, "innetDuration");
            return (Criteria) this;
        }

        public Criteria andInnetDurationNotIn(List<String> values) {
            addCriterion("INNET_DURATION not in", values, "innetDuration");
            return (Criteria) this;
        }

        public Criteria andInnetDurationBetween(String value1, String value2) {
            addCriterion("INNET_DURATION between", value1, value2, "innetDuration");
            return (Criteria) this;
        }

        public Criteria andInnetDurationNotBetween(String value1, String value2) {
            addCriterion("INNET_DURATION not between", value1, value2, "innetDuration");
            return (Criteria) this;
        }

        public Criteria andCriditIsNull() {
            addCriterion("CRIDIT is null");
            return (Criteria) this;
        }

        public Criteria andCriditIsNotNull() {
            addCriterion("CRIDIT is not null");
            return (Criteria) this;
        }

        public Criteria andCriditEqualTo(Short value) {
            addCriterion("CRIDIT =", value, "cridit");
            return (Criteria) this;
        }

        public Criteria andCriditNotEqualTo(Short value) {
            addCriterion("CRIDIT <>", value, "cridit");
            return (Criteria) this;
        }

        public Criteria andCriditGreaterThan(Short value) {
            addCriterion("CRIDIT >", value, "cridit");
            return (Criteria) this;
        }

        public Criteria andCriditGreaterThanOrEqualTo(Short value) {
            addCriterion("CRIDIT >=", value, "cridit");
            return (Criteria) this;
        }

        public Criteria andCriditLessThan(Short value) {
            addCriterion("CRIDIT <", value, "cridit");
            return (Criteria) this;
        }

        public Criteria andCriditLessThanOrEqualTo(Short value) {
            addCriterion("CRIDIT <=", value, "cridit");
            return (Criteria) this;
        }

        public Criteria andCriditIn(List<Short> values) {
            addCriterion("CRIDIT in", values, "cridit");
            return (Criteria) this;
        }

        public Criteria andCriditNotIn(List<Short> values) {
            addCriterion("CRIDIT not in", values, "cridit");
            return (Criteria) this;
        }

        public Criteria andCriditBetween(Short value1, Short value2) {
            addCriterion("CRIDIT between", value1, value2, "cridit");
            return (Criteria) this;
        }

        public Criteria andCriditNotBetween(Short value1, Short value2) {
            addCriterion("CRIDIT not between", value1, value2, "cridit");
            return (Criteria) this;
        }

        public Criteria andIdAddressIsNull() {
            addCriterion("ID_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andIdAddressIsNotNull() {
            addCriterion("ID_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andIdAddressEqualTo(String value) {
            addCriterion("ID_ADDRESS =", value, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressNotEqualTo(String value) {
            addCriterion("ID_ADDRESS <>", value, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressGreaterThan(String value) {
            addCriterion("ID_ADDRESS >", value, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ID_ADDRESS >=", value, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressLessThan(String value) {
            addCriterion("ID_ADDRESS <", value, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressLessThanOrEqualTo(String value) {
            addCriterion("ID_ADDRESS <=", value, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressLike(String value) {
            addCriterion("ID_ADDRESS like", value, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressNotLike(String value) {
            addCriterion("ID_ADDRESS not like", value, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressIn(List<String> values) {
            addCriterion("ID_ADDRESS in", values, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressNotIn(List<String> values) {
            addCriterion("ID_ADDRESS not in", values, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressBetween(String value1, String value2) {
            addCriterion("ID_ADDRESS between", value1, value2, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressNotBetween(String value1, String value2) {
            addCriterion("ID_ADDRESS not between", value1, value2, "idAddress");
            return (Criteria) this;
        }

        public Criteria andSubClubIsNull() {
            addCriterion("SUB_CLUB is null");
            return (Criteria) this;
        }

        public Criteria andSubClubIsNotNull() {
            addCriterion("SUB_CLUB is not null");
            return (Criteria) this;
        }

        public Criteria andSubClubEqualTo(String value) {
            addCriterion("SUB_CLUB =", value, "subClub");
            return (Criteria) this;
        }

        public Criteria andSubClubNotEqualTo(String value) {
            addCriterion("SUB_CLUB <>", value, "subClub");
            return (Criteria) this;
        }

        public Criteria andSubClubGreaterThan(String value) {
            addCriterion("SUB_CLUB >", value, "subClub");
            return (Criteria) this;
        }

        public Criteria andSubClubGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_CLUB >=", value, "subClub");
            return (Criteria) this;
        }

        public Criteria andSubClubLessThan(String value) {
            addCriterion("SUB_CLUB <", value, "subClub");
            return (Criteria) this;
        }

        public Criteria andSubClubLessThanOrEqualTo(String value) {
            addCriterion("SUB_CLUB <=", value, "subClub");
            return (Criteria) this;
        }

        public Criteria andSubClubLike(String value) {
            addCriterion("SUB_CLUB like", value, "subClub");
            return (Criteria) this;
        }

        public Criteria andSubClubNotLike(String value) {
            addCriterion("SUB_CLUB not like", value, "subClub");
            return (Criteria) this;
        }

        public Criteria andSubClubIn(List<String> values) {
            addCriterion("SUB_CLUB in", values, "subClub");
            return (Criteria) this;
        }

        public Criteria andSubClubNotIn(List<String> values) {
            addCriterion("SUB_CLUB not in", values, "subClub");
            return (Criteria) this;
        }

        public Criteria andSubClubBetween(String value1, String value2) {
            addCriterion("SUB_CLUB between", value1, value2, "subClub");
            return (Criteria) this;
        }

        public Criteria andSubClubNotBetween(String value1, String value2) {
            addCriterion("SUB_CLUB not between", value1, value2, "subClub");
            return (Criteria) this;
        }

        public Criteria andVipAvaDurationIsNull() {
            addCriterion("VIP_AVA_DURATION is null");
            return (Criteria) this;
        }

        public Criteria andVipAvaDurationIsNotNull() {
            addCriterion("VIP_AVA_DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andVipAvaDurationEqualTo(Short value) {
            addCriterion("VIP_AVA_DURATION =", value, "vipAvaDuration");
            return (Criteria) this;
        }

        public Criteria andVipAvaDurationNotEqualTo(Short value) {
            addCriterion("VIP_AVA_DURATION <>", value, "vipAvaDuration");
            return (Criteria) this;
        }

        public Criteria andVipAvaDurationGreaterThan(Short value) {
            addCriterion("VIP_AVA_DURATION >", value, "vipAvaDuration");
            return (Criteria) this;
        }

        public Criteria andVipAvaDurationGreaterThanOrEqualTo(Short value) {
            addCriterion("VIP_AVA_DURATION >=", value, "vipAvaDuration");
            return (Criteria) this;
        }

        public Criteria andVipAvaDurationLessThan(Short value) {
            addCriterion("VIP_AVA_DURATION <", value, "vipAvaDuration");
            return (Criteria) this;
        }

        public Criteria andVipAvaDurationLessThanOrEqualTo(Short value) {
            addCriterion("VIP_AVA_DURATION <=", value, "vipAvaDuration");
            return (Criteria) this;
        }

        public Criteria andVipAvaDurationIn(List<Short> values) {
            addCriterion("VIP_AVA_DURATION in", values, "vipAvaDuration");
            return (Criteria) this;
        }

        public Criteria andVipAvaDurationNotIn(List<Short> values) {
            addCriterion("VIP_AVA_DURATION not in", values, "vipAvaDuration");
            return (Criteria) this;
        }

        public Criteria andVipAvaDurationBetween(Short value1, Short value2) {
            addCriterion("VIP_AVA_DURATION between", value1, value2, "vipAvaDuration");
            return (Criteria) this;
        }

        public Criteria andVipAvaDurationNotBetween(Short value1, Short value2) {
            addCriterion("VIP_AVA_DURATION not between", value1, value2, "vipAvaDuration");
            return (Criteria) this;
        }

        public Criteria andIfMadeCardIsNull() {
            addCriterion("IF_MADE_CARD is null");
            return (Criteria) this;
        }

        public Criteria andIfMadeCardIsNotNull() {
            addCriterion("IF_MADE_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andIfMadeCardEqualTo(String value) {
            addCriterion("IF_MADE_CARD =", value, "ifMadeCard");
            return (Criteria) this;
        }

        public Criteria andIfMadeCardNotEqualTo(String value) {
            addCriterion("IF_MADE_CARD <>", value, "ifMadeCard");
            return (Criteria) this;
        }

        public Criteria andIfMadeCardGreaterThan(String value) {
            addCriterion("IF_MADE_CARD >", value, "ifMadeCard");
            return (Criteria) this;
        }

        public Criteria andIfMadeCardGreaterThanOrEqualTo(String value) {
            addCriterion("IF_MADE_CARD >=", value, "ifMadeCard");
            return (Criteria) this;
        }

        public Criteria andIfMadeCardLessThan(String value) {
            addCriterion("IF_MADE_CARD <", value, "ifMadeCard");
            return (Criteria) this;
        }

        public Criteria andIfMadeCardLessThanOrEqualTo(String value) {
            addCriterion("IF_MADE_CARD <=", value, "ifMadeCard");
            return (Criteria) this;
        }

        public Criteria andIfMadeCardLike(String value) {
            addCriterion("IF_MADE_CARD like", value, "ifMadeCard");
            return (Criteria) this;
        }

        public Criteria andIfMadeCardNotLike(String value) {
            addCriterion("IF_MADE_CARD not like", value, "ifMadeCard");
            return (Criteria) this;
        }

        public Criteria andIfMadeCardIn(List<String> values) {
            addCriterion("IF_MADE_CARD in", values, "ifMadeCard");
            return (Criteria) this;
        }

        public Criteria andIfMadeCardNotIn(List<String> values) {
            addCriterion("IF_MADE_CARD not in", values, "ifMadeCard");
            return (Criteria) this;
        }

        public Criteria andIfMadeCardBetween(String value1, String value2) {
            addCriterion("IF_MADE_CARD between", value1, value2, "ifMadeCard");
            return (Criteria) this;
        }

        public Criteria andIfMadeCardNotBetween(String value1, String value2) {
            addCriterion("IF_MADE_CARD not between", value1, value2, "ifMadeCard");
            return (Criteria) this;
        }

        public Criteria andIfAgreementIsNull() {
            addCriterion("IF_AGREEMENT is null");
            return (Criteria) this;
        }

        public Criteria andIfAgreementIsNotNull() {
            addCriterion("IF_AGREEMENT is not null");
            return (Criteria) this;
        }

        public Criteria andIfAgreementEqualTo(String value) {
            addCriterion("IF_AGREEMENT =", value, "ifAgreement");
            return (Criteria) this;
        }

        public Criteria andIfAgreementNotEqualTo(String value) {
            addCriterion("IF_AGREEMENT <>", value, "ifAgreement");
            return (Criteria) this;
        }

        public Criteria andIfAgreementGreaterThan(String value) {
            addCriterion("IF_AGREEMENT >", value, "ifAgreement");
            return (Criteria) this;
        }

        public Criteria andIfAgreementGreaterThanOrEqualTo(String value) {
            addCriterion("IF_AGREEMENT >=", value, "ifAgreement");
            return (Criteria) this;
        }

        public Criteria andIfAgreementLessThan(String value) {
            addCriterion("IF_AGREEMENT <", value, "ifAgreement");
            return (Criteria) this;
        }

        public Criteria andIfAgreementLessThanOrEqualTo(String value) {
            addCriterion("IF_AGREEMENT <=", value, "ifAgreement");
            return (Criteria) this;
        }

        public Criteria andIfAgreementLike(String value) {
            addCriterion("IF_AGREEMENT like", value, "ifAgreement");
            return (Criteria) this;
        }

        public Criteria andIfAgreementNotLike(String value) {
            addCriterion("IF_AGREEMENT not like", value, "ifAgreement");
            return (Criteria) this;
        }

        public Criteria andIfAgreementIn(List<String> values) {
            addCriterion("IF_AGREEMENT in", values, "ifAgreement");
            return (Criteria) this;
        }

        public Criteria andIfAgreementNotIn(List<String> values) {
            addCriterion("IF_AGREEMENT not in", values, "ifAgreement");
            return (Criteria) this;
        }

        public Criteria andIfAgreementBetween(String value1, String value2) {
            addCriterion("IF_AGREEMENT between", value1, value2, "ifAgreement");
            return (Criteria) this;
        }

        public Criteria andIfAgreementNotBetween(String value1, String value2) {
            addCriterion("IF_AGREEMENT not between", value1, value2, "ifAgreement");
            return (Criteria) this;
        }

        public Criteria andIfSaleModeIsNull() {
            addCriterion("IF_SALE_MODE is null");
            return (Criteria) this;
        }

        public Criteria andIfSaleModeIsNotNull() {
            addCriterion("IF_SALE_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andIfSaleModeEqualTo(String value) {
            addCriterion("IF_SALE_MODE =", value, "ifSaleMode");
            return (Criteria) this;
        }

        public Criteria andIfSaleModeNotEqualTo(String value) {
            addCriterion("IF_SALE_MODE <>", value, "ifSaleMode");
            return (Criteria) this;
        }

        public Criteria andIfSaleModeGreaterThan(String value) {
            addCriterion("IF_SALE_MODE >", value, "ifSaleMode");
            return (Criteria) this;
        }

        public Criteria andIfSaleModeGreaterThanOrEqualTo(String value) {
            addCriterion("IF_SALE_MODE >=", value, "ifSaleMode");
            return (Criteria) this;
        }

        public Criteria andIfSaleModeLessThan(String value) {
            addCriterion("IF_SALE_MODE <", value, "ifSaleMode");
            return (Criteria) this;
        }

        public Criteria andIfSaleModeLessThanOrEqualTo(String value) {
            addCriterion("IF_SALE_MODE <=", value, "ifSaleMode");
            return (Criteria) this;
        }

        public Criteria andIfSaleModeLike(String value) {
            addCriterion("IF_SALE_MODE like", value, "ifSaleMode");
            return (Criteria) this;
        }

        public Criteria andIfSaleModeNotLike(String value) {
            addCriterion("IF_SALE_MODE not like", value, "ifSaleMode");
            return (Criteria) this;
        }

        public Criteria andIfSaleModeIn(List<String> values) {
            addCriterion("IF_SALE_MODE in", values, "ifSaleMode");
            return (Criteria) this;
        }

        public Criteria andIfSaleModeNotIn(List<String> values) {
            addCriterion("IF_SALE_MODE not in", values, "ifSaleMode");
            return (Criteria) this;
        }

        public Criteria andIfSaleModeBetween(String value1, String value2) {
            addCriterion("IF_SALE_MODE between", value1, value2, "ifSaleMode");
            return (Criteria) this;
        }

        public Criteria andIfSaleModeNotBetween(String value1, String value2) {
            addCriterion("IF_SALE_MODE not between", value1, value2, "ifSaleMode");
            return (Criteria) this;
        }

        public Criteria andPhotoDescIsNull() {
            addCriterion("PHOTO_DESC is null");
            return (Criteria) this;
        }

        public Criteria andPhotoDescIsNotNull() {
            addCriterion("PHOTO_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoDescEqualTo(String value) {
            addCriterion("PHOTO_DESC =", value, "photoDesc");
            return (Criteria) this;
        }

        public Criteria andPhotoDescNotEqualTo(String value) {
            addCriterion("PHOTO_DESC <>", value, "photoDesc");
            return (Criteria) this;
        }

        public Criteria andPhotoDescGreaterThan(String value) {
            addCriterion("PHOTO_DESC >", value, "photoDesc");
            return (Criteria) this;
        }

        public Criteria andPhotoDescGreaterThanOrEqualTo(String value) {
            addCriterion("PHOTO_DESC >=", value, "photoDesc");
            return (Criteria) this;
        }

        public Criteria andPhotoDescLessThan(String value) {
            addCriterion("PHOTO_DESC <", value, "photoDesc");
            return (Criteria) this;
        }

        public Criteria andPhotoDescLessThanOrEqualTo(String value) {
            addCriterion("PHOTO_DESC <=", value, "photoDesc");
            return (Criteria) this;
        }

        public Criteria andPhotoDescLike(String value) {
            addCriterion("PHOTO_DESC like", value, "photoDesc");
            return (Criteria) this;
        }

        public Criteria andPhotoDescNotLike(String value) {
            addCriterion("PHOTO_DESC not like", value, "photoDesc");
            return (Criteria) this;
        }

        public Criteria andPhotoDescIn(List<String> values) {
            addCriterion("PHOTO_DESC in", values, "photoDesc");
            return (Criteria) this;
        }

        public Criteria andPhotoDescNotIn(List<String> values) {
            addCriterion("PHOTO_DESC not in", values, "photoDesc");
            return (Criteria) this;
        }

        public Criteria andPhotoDescBetween(String value1, String value2) {
            addCriterion("PHOTO_DESC between", value1, value2, "photoDesc");
            return (Criteria) this;
        }

        public Criteria andPhotoDescNotBetween(String value1, String value2) {
            addCriterion("PHOTO_DESC not between", value1, value2, "photoDesc");
            return (Criteria) this;
        }

        public Criteria andExpireMonthIsNull() {
            addCriterion("EXPIRE_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andExpireMonthIsNotNull() {
            addCriterion("EXPIRE_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andExpireMonthEqualTo(String value) {
            addCriterion("EXPIRE_MONTH =", value, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthNotEqualTo(String value) {
            addCriterion("EXPIRE_MONTH <>", value, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthGreaterThan(String value) {
            addCriterion("EXPIRE_MONTH >", value, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthGreaterThanOrEqualTo(String value) {
            addCriterion("EXPIRE_MONTH >=", value, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthLessThan(String value) {
            addCriterion("EXPIRE_MONTH <", value, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthLessThanOrEqualTo(String value) {
            addCriterion("EXPIRE_MONTH <=", value, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthLike(String value) {
            addCriterion("EXPIRE_MONTH like", value, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthNotLike(String value) {
            addCriterion("EXPIRE_MONTH not like", value, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthIn(List<String> values) {
            addCriterion("EXPIRE_MONTH in", values, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthNotIn(List<String> values) {
            addCriterion("EXPIRE_MONTH not in", values, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthBetween(String value1, String value2) {
            addCriterion("EXPIRE_MONTH between", value1, value2, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthNotBetween(String value1, String value2) {
            addCriterion("EXPIRE_MONTH not between", value1, value2, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andSendCardFlagIsNull() {
            addCriterion("SEND_CARD_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSendCardFlagIsNotNull() {
            addCriterion("SEND_CARD_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSendCardFlagEqualTo(String value) {
            addCriterion("SEND_CARD_FLAG =", value, "sendCardFlag");
            return (Criteria) this;
        }

        public Criteria andSendCardFlagNotEqualTo(String value) {
            addCriterion("SEND_CARD_FLAG <>", value, "sendCardFlag");
            return (Criteria) this;
        }

        public Criteria andSendCardFlagGreaterThan(String value) {
            addCriterion("SEND_CARD_FLAG >", value, "sendCardFlag");
            return (Criteria) this;
        }

        public Criteria andSendCardFlagGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_CARD_FLAG >=", value, "sendCardFlag");
            return (Criteria) this;
        }

        public Criteria andSendCardFlagLessThan(String value) {
            addCriterion("SEND_CARD_FLAG <", value, "sendCardFlag");
            return (Criteria) this;
        }

        public Criteria andSendCardFlagLessThanOrEqualTo(String value) {
            addCriterion("SEND_CARD_FLAG <=", value, "sendCardFlag");
            return (Criteria) this;
        }

        public Criteria andSendCardFlagLike(String value) {
            addCriterion("SEND_CARD_FLAG like", value, "sendCardFlag");
            return (Criteria) this;
        }

        public Criteria andSendCardFlagNotLike(String value) {
            addCriterion("SEND_CARD_FLAG not like", value, "sendCardFlag");
            return (Criteria) this;
        }

        public Criteria andSendCardFlagIn(List<String> values) {
            addCriterion("SEND_CARD_FLAG in", values, "sendCardFlag");
            return (Criteria) this;
        }

        public Criteria andSendCardFlagNotIn(List<String> values) {
            addCriterion("SEND_CARD_FLAG not in", values, "sendCardFlag");
            return (Criteria) this;
        }

        public Criteria andSendCardFlagBetween(String value1, String value2) {
            addCriterion("SEND_CARD_FLAG between", value1, value2, "sendCardFlag");
            return (Criteria) this;
        }

        public Criteria andSendCardFlagNotBetween(String value1, String value2) {
            addCriterion("SEND_CARD_FLAG not between", value1, value2, "sendCardFlag");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andInnetDeptIsNull() {
            addCriterion("INNET_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andInnetDeptIsNotNull() {
            addCriterion("INNET_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andInnetDeptEqualTo(String value) {
            addCriterion("INNET_DEPT =", value, "innetDept");
            return (Criteria) this;
        }

        public Criteria andInnetDeptNotEqualTo(String value) {
            addCriterion("INNET_DEPT <>", value, "innetDept");
            return (Criteria) this;
        }

        public Criteria andInnetDeptGreaterThan(String value) {
            addCriterion("INNET_DEPT >", value, "innetDept");
            return (Criteria) this;
        }

        public Criteria andInnetDeptGreaterThanOrEqualTo(String value) {
            addCriterion("INNET_DEPT >=", value, "innetDept");
            return (Criteria) this;
        }

        public Criteria andInnetDeptLessThan(String value) {
            addCriterion("INNET_DEPT <", value, "innetDept");
            return (Criteria) this;
        }

        public Criteria andInnetDeptLessThanOrEqualTo(String value) {
            addCriterion("INNET_DEPT <=", value, "innetDept");
            return (Criteria) this;
        }

        public Criteria andInnetDeptLike(String value) {
            addCriterion("INNET_DEPT like", value, "innetDept");
            return (Criteria) this;
        }

        public Criteria andInnetDeptNotLike(String value) {
            addCriterion("INNET_DEPT not like", value, "innetDept");
            return (Criteria) this;
        }

        public Criteria andInnetDeptIn(List<String> values) {
            addCriterion("INNET_DEPT in", values, "innetDept");
            return (Criteria) this;
        }

        public Criteria andInnetDeptNotIn(List<String> values) {
            addCriterion("INNET_DEPT not in", values, "innetDept");
            return (Criteria) this;
        }

        public Criteria andInnetDeptBetween(String value1, String value2) {
            addCriterion("INNET_DEPT between", value1, value2, "innetDept");
            return (Criteria) this;
        }

        public Criteria andInnetDeptNotBetween(String value1, String value2) {
            addCriterion("INNET_DEPT not between", value1, value2, "innetDept");
            return (Criteria) this;
        }

        public Criteria andPolicyIsNull() {
            addCriterion("POLICY is null");
            return (Criteria) this;
        }

        public Criteria andPolicyIsNotNull() {
            addCriterion("POLICY is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyEqualTo(String value) {
            addCriterion("POLICY =", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyNotEqualTo(String value) {
            addCriterion("POLICY <>", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyGreaterThan(String value) {
            addCriterion("POLICY >", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyGreaterThanOrEqualTo(String value) {
            addCriterion("POLICY >=", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyLessThan(String value) {
            addCriterion("POLICY <", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyLessThanOrEqualTo(String value) {
            addCriterion("POLICY <=", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyLike(String value) {
            addCriterion("POLICY like", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyNotLike(String value) {
            addCriterion("POLICY not like", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyIn(List<String> values) {
            addCriterion("POLICY in", values, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyNotIn(List<String> values) {
            addCriterion("POLICY not in", values, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyBetween(String value1, String value2) {
            addCriterion("POLICY between", value1, value2, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyNotBetween(String value1, String value2) {
            addCriterion("POLICY not between", value1, value2, "policy");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarIsNull() {
            addCriterion("BIRTHDAY_LUNAR is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarIsNotNull() {
            addCriterion("BIRTHDAY_LUNAR is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarEqualTo(String value) {
            addCriterion("BIRTHDAY_LUNAR =", value, "birthdayLunar");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarNotEqualTo(String value) {
            addCriterion("BIRTHDAY_LUNAR <>", value, "birthdayLunar");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarGreaterThan(String value) {
            addCriterion("BIRTHDAY_LUNAR >", value, "birthdayLunar");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY_LUNAR >=", value, "birthdayLunar");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarLessThan(String value) {
            addCriterion("BIRTHDAY_LUNAR <", value, "birthdayLunar");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarLessThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY_LUNAR <=", value, "birthdayLunar");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarLike(String value) {
            addCriterion("BIRTHDAY_LUNAR like", value, "birthdayLunar");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarNotLike(String value) {
            addCriterion("BIRTHDAY_LUNAR not like", value, "birthdayLunar");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarIn(List<String> values) {
            addCriterion("BIRTHDAY_LUNAR in", values, "birthdayLunar");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarNotIn(List<String> values) {
            addCriterion("BIRTHDAY_LUNAR not in", values, "birthdayLunar");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarBetween(String value1, String value2) {
            addCriterion("BIRTHDAY_LUNAR between", value1, value2, "birthdayLunar");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarNotBetween(String value1, String value2) {
            addCriterion("BIRTHDAY_LUNAR not between", value1, value2, "birthdayLunar");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeIsNull() {
            addCriterion("NET_TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeIsNotNull() {
            addCriterion("NET_TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeEqualTo(String value) {
            addCriterion("NET_TYPE_CODE =", value, "netTypeCode");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeNotEqualTo(String value) {
            addCriterion("NET_TYPE_CODE <>", value, "netTypeCode");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeGreaterThan(String value) {
            addCriterion("NET_TYPE_CODE >", value, "netTypeCode");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("NET_TYPE_CODE >=", value, "netTypeCode");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeLessThan(String value) {
            addCriterion("NET_TYPE_CODE <", value, "netTypeCode");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("NET_TYPE_CODE <=", value, "netTypeCode");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeLike(String value) {
            addCriterion("NET_TYPE_CODE like", value, "netTypeCode");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeNotLike(String value) {
            addCriterion("NET_TYPE_CODE not like", value, "netTypeCode");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeIn(List<String> values) {
            addCriterion("NET_TYPE_CODE in", values, "netTypeCode");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeNotIn(List<String> values) {
            addCriterion("NET_TYPE_CODE not in", values, "netTypeCode");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeBetween(String value1, String value2) {
            addCriterion("NET_TYPE_CODE between", value1, value2, "netTypeCode");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeNotBetween(String value1, String value2) {
            addCriterion("NET_TYPE_CODE not between", value1, value2, "netTypeCode");
            return (Criteria) this;
        }

        public Criteria andNetTypeDescIsNull() {
            addCriterion("NET_TYPE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andNetTypeDescIsNotNull() {
            addCriterion("NET_TYPE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andNetTypeDescEqualTo(String value) {
            addCriterion("NET_TYPE_DESC =", value, "netTypeDesc");
            return (Criteria) this;
        }

        public Criteria andNetTypeDescNotEqualTo(String value) {
            addCriterion("NET_TYPE_DESC <>", value, "netTypeDesc");
            return (Criteria) this;
        }

        public Criteria andNetTypeDescGreaterThan(String value) {
            addCriterion("NET_TYPE_DESC >", value, "netTypeDesc");
            return (Criteria) this;
        }

        public Criteria andNetTypeDescGreaterThanOrEqualTo(String value) {
            addCriterion("NET_TYPE_DESC >=", value, "netTypeDesc");
            return (Criteria) this;
        }

        public Criteria andNetTypeDescLessThan(String value) {
            addCriterion("NET_TYPE_DESC <", value, "netTypeDesc");
            return (Criteria) this;
        }

        public Criteria andNetTypeDescLessThanOrEqualTo(String value) {
            addCriterion("NET_TYPE_DESC <=", value, "netTypeDesc");
            return (Criteria) this;
        }

        public Criteria andNetTypeDescLike(String value) {
            addCriterion("NET_TYPE_DESC like", value, "netTypeDesc");
            return (Criteria) this;
        }

        public Criteria andNetTypeDescNotLike(String value) {
            addCriterion("NET_TYPE_DESC not like", value, "netTypeDesc");
            return (Criteria) this;
        }

        public Criteria andNetTypeDescIn(List<String> values) {
            addCriterion("NET_TYPE_DESC in", values, "netTypeDesc");
            return (Criteria) this;
        }

        public Criteria andNetTypeDescNotIn(List<String> values) {
            addCriterion("NET_TYPE_DESC not in", values, "netTypeDesc");
            return (Criteria) this;
        }

        public Criteria andNetTypeDescBetween(String value1, String value2) {
            addCriterion("NET_TYPE_DESC between", value1, value2, "netTypeDesc");
            return (Criteria) this;
        }

        public Criteria andNetTypeDescNotBetween(String value1, String value2) {
            addCriterion("NET_TYPE_DESC not between", value1, value2, "netTypeDesc");
            return (Criteria) this;
        }

        public Criteria andDistTimeIsNull() {
            addCriterion("DIST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDistTimeIsNotNull() {
            addCriterion("DIST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDistTimeEqualTo(Date value) {
            addCriterion("DIST_TIME =", value, "distTime");
            return (Criteria) this;
        }

        public Criteria andDistTimeNotEqualTo(Date value) {
            addCriterion("DIST_TIME <>", value, "distTime");
            return (Criteria) this;
        }

        public Criteria andDistTimeGreaterThan(Date value) {
            addCriterion("DIST_TIME >", value, "distTime");
            return (Criteria) this;
        }

        public Criteria andDistTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DIST_TIME >=", value, "distTime");
            return (Criteria) this;
        }

        public Criteria andDistTimeLessThan(Date value) {
            addCriterion("DIST_TIME <", value, "distTime");
            return (Criteria) this;
        }

        public Criteria andDistTimeLessThanOrEqualTo(Date value) {
            addCriterion("DIST_TIME <=", value, "distTime");
            return (Criteria) this;
        }

        public Criteria andDistTimeIn(List<Date> values) {
            addCriterion("DIST_TIME in", values, "distTime");
            return (Criteria) this;
        }

        public Criteria andDistTimeNotIn(List<Date> values) {
            addCriterion("DIST_TIME not in", values, "distTime");
            return (Criteria) this;
        }

        public Criteria andDistTimeBetween(Date value1, Date value2) {
            addCriterion("DIST_TIME between", value1, value2, "distTime");
            return (Criteria) this;
        }

        public Criteria andDistTimeNotBetween(Date value1, Date value2) {
            addCriterion("DIST_TIME not between", value1, value2, "distTime");
            return (Criteria) this;
        }

        public Criteria andSaleModeBdateIsNull() {
            addCriterion("SALE_MODE_BDATE is null");
            return (Criteria) this;
        }

        public Criteria andSaleModeBdateIsNotNull() {
            addCriterion("SALE_MODE_BDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSaleModeBdateEqualTo(Date value) {
            addCriterion("SALE_MODE_BDATE =", value, "saleModeBdate");
            return (Criteria) this;
        }

        public Criteria andSaleModeBdateNotEqualTo(Date value) {
            addCriterion("SALE_MODE_BDATE <>", value, "saleModeBdate");
            return (Criteria) this;
        }

        public Criteria andSaleModeBdateGreaterThan(Date value) {
            addCriterion("SALE_MODE_BDATE >", value, "saleModeBdate");
            return (Criteria) this;
        }

        public Criteria andSaleModeBdateGreaterThanOrEqualTo(Date value) {
            addCriterion("SALE_MODE_BDATE >=", value, "saleModeBdate");
            return (Criteria) this;
        }

        public Criteria andSaleModeBdateLessThan(Date value) {
            addCriterion("SALE_MODE_BDATE <", value, "saleModeBdate");
            return (Criteria) this;
        }

        public Criteria andSaleModeBdateLessThanOrEqualTo(Date value) {
            addCriterion("SALE_MODE_BDATE <=", value, "saleModeBdate");
            return (Criteria) this;
        }

        public Criteria andSaleModeBdateIn(List<Date> values) {
            addCriterion("SALE_MODE_BDATE in", values, "saleModeBdate");
            return (Criteria) this;
        }

        public Criteria andSaleModeBdateNotIn(List<Date> values) {
            addCriterion("SALE_MODE_BDATE not in", values, "saleModeBdate");
            return (Criteria) this;
        }

        public Criteria andSaleModeBdateBetween(Date value1, Date value2) {
            addCriterion("SALE_MODE_BDATE between", value1, value2, "saleModeBdate");
            return (Criteria) this;
        }

        public Criteria andSaleModeBdateNotBetween(Date value1, Date value2) {
            addCriterion("SALE_MODE_BDATE not between", value1, value2, "saleModeBdate");
            return (Criteria) this;
        }

        public Criteria andSaleModeEdateIsNull() {
            addCriterion("SALE_MODE_EDATE is null");
            return (Criteria) this;
        }

        public Criteria andSaleModeEdateIsNotNull() {
            addCriterion("SALE_MODE_EDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSaleModeEdateEqualTo(Date value) {
            addCriterion("SALE_MODE_EDATE =", value, "saleModeEdate");
            return (Criteria) this;
        }

        public Criteria andSaleModeEdateNotEqualTo(Date value) {
            addCriterion("SALE_MODE_EDATE <>", value, "saleModeEdate");
            return (Criteria) this;
        }

        public Criteria andSaleModeEdateGreaterThan(Date value) {
            addCriterion("SALE_MODE_EDATE >", value, "saleModeEdate");
            return (Criteria) this;
        }

        public Criteria andSaleModeEdateGreaterThanOrEqualTo(Date value) {
            addCriterion("SALE_MODE_EDATE >=", value, "saleModeEdate");
            return (Criteria) this;
        }

        public Criteria andSaleModeEdateLessThan(Date value) {
            addCriterion("SALE_MODE_EDATE <", value, "saleModeEdate");
            return (Criteria) this;
        }

        public Criteria andSaleModeEdateLessThanOrEqualTo(Date value) {
            addCriterion("SALE_MODE_EDATE <=", value, "saleModeEdate");
            return (Criteria) this;
        }

        public Criteria andSaleModeEdateIn(List<Date> values) {
            addCriterion("SALE_MODE_EDATE in", values, "saleModeEdate");
            return (Criteria) this;
        }

        public Criteria andSaleModeEdateNotIn(List<Date> values) {
            addCriterion("SALE_MODE_EDATE not in", values, "saleModeEdate");
            return (Criteria) this;
        }

        public Criteria andSaleModeEdateBetween(Date value1, Date value2) {
            addCriterion("SALE_MODE_EDATE between", value1, value2, "saleModeEdate");
            return (Criteria) this;
        }

        public Criteria andSaleModeEdateNotBetween(Date value1, Date value2) {
            addCriterion("SALE_MODE_EDATE not between", value1, value2, "saleModeEdate");
            return (Criteria) this;
        }

        public Criteria andVipCardStartDateIsNull() {
            addCriterion("VIP_CARD_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andVipCardStartDateIsNotNull() {
            addCriterion("VIP_CARD_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andVipCardStartDateEqualTo(Date value) {
            addCriterion("VIP_CARD_START_DATE =", value, "vipCardStartDate");
            return (Criteria) this;
        }

        public Criteria andVipCardStartDateNotEqualTo(Date value) {
            addCriterion("VIP_CARD_START_DATE <>", value, "vipCardStartDate");
            return (Criteria) this;
        }

        public Criteria andVipCardStartDateGreaterThan(Date value) {
            addCriterion("VIP_CARD_START_DATE >", value, "vipCardStartDate");
            return (Criteria) this;
        }

        public Criteria andVipCardStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("VIP_CARD_START_DATE >=", value, "vipCardStartDate");
            return (Criteria) this;
        }

        public Criteria andVipCardStartDateLessThan(Date value) {
            addCriterion("VIP_CARD_START_DATE <", value, "vipCardStartDate");
            return (Criteria) this;
        }

        public Criteria andVipCardStartDateLessThanOrEqualTo(Date value) {
            addCriterion("VIP_CARD_START_DATE <=", value, "vipCardStartDate");
            return (Criteria) this;
        }

        public Criteria andVipCardStartDateIn(List<Date> values) {
            addCriterion("VIP_CARD_START_DATE in", values, "vipCardStartDate");
            return (Criteria) this;
        }

        public Criteria andVipCardStartDateNotIn(List<Date> values) {
            addCriterion("VIP_CARD_START_DATE not in", values, "vipCardStartDate");
            return (Criteria) this;
        }

        public Criteria andVipCardStartDateBetween(Date value1, Date value2) {
            addCriterion("VIP_CARD_START_DATE between", value1, value2, "vipCardStartDate");
            return (Criteria) this;
        }

        public Criteria andVipCardStartDateNotBetween(Date value1, Date value2) {
            addCriterion("VIP_CARD_START_DATE not between", value1, value2, "vipCardStartDate");
            return (Criteria) this;
        }

        public Criteria andVipCardEndDateIsNull() {
            addCriterion("VIP_CARD_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andVipCardEndDateIsNotNull() {
            addCriterion("VIP_CARD_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andVipCardEndDateEqualTo(Date value) {
            addCriterion("VIP_CARD_END_DATE =", value, "vipCardEndDate");
            return (Criteria) this;
        }

        public Criteria andVipCardEndDateNotEqualTo(Date value) {
            addCriterion("VIP_CARD_END_DATE <>", value, "vipCardEndDate");
            return (Criteria) this;
        }

        public Criteria andVipCardEndDateGreaterThan(Date value) {
            addCriterion("VIP_CARD_END_DATE >", value, "vipCardEndDate");
            return (Criteria) this;
        }

        public Criteria andVipCardEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("VIP_CARD_END_DATE >=", value, "vipCardEndDate");
            return (Criteria) this;
        }

        public Criteria andVipCardEndDateLessThan(Date value) {
            addCriterion("VIP_CARD_END_DATE <", value, "vipCardEndDate");
            return (Criteria) this;
        }

        public Criteria andVipCardEndDateLessThanOrEqualTo(Date value) {
            addCriterion("VIP_CARD_END_DATE <=", value, "vipCardEndDate");
            return (Criteria) this;
        }

        public Criteria andVipCardEndDateIn(List<Date> values) {
            addCriterion("VIP_CARD_END_DATE in", values, "vipCardEndDate");
            return (Criteria) this;
        }

        public Criteria andVipCardEndDateNotIn(List<Date> values) {
            addCriterion("VIP_CARD_END_DATE not in", values, "vipCardEndDate");
            return (Criteria) this;
        }

        public Criteria andVipCardEndDateBetween(Date value1, Date value2) {
            addCriterion("VIP_CARD_END_DATE between", value1, value2, "vipCardEndDate");
            return (Criteria) this;
        }

        public Criteria andVipCardEndDateNotBetween(Date value1, Date value2) {
            addCriterion("VIP_CARD_END_DATE not between", value1, value2, "vipCardEndDate");
            return (Criteria) this;
        }

        public Criteria andIsLocal3gIsNull() {
            addCriterion("IS_LOCAL_3G is null");
            return (Criteria) this;
        }

        public Criteria andIsLocal3gIsNotNull() {
            addCriterion("IS_LOCAL_3G is not null");
            return (Criteria) this;
        }

        public Criteria andIsLocal3gEqualTo(String value) {
            addCriterion("IS_LOCAL_3G =", value, "isLocal3g");
            return (Criteria) this;
        }

        public Criteria andIsLocal3gNotEqualTo(String value) {
            addCriterion("IS_LOCAL_3G <>", value, "isLocal3g");
            return (Criteria) this;
        }

        public Criteria andIsLocal3gGreaterThan(String value) {
            addCriterion("IS_LOCAL_3G >", value, "isLocal3g");
            return (Criteria) this;
        }

        public Criteria andIsLocal3gGreaterThanOrEqualTo(String value) {
            addCriterion("IS_LOCAL_3G >=", value, "isLocal3g");
            return (Criteria) this;
        }

        public Criteria andIsLocal3gLessThan(String value) {
            addCriterion("IS_LOCAL_3G <", value, "isLocal3g");
            return (Criteria) this;
        }

        public Criteria andIsLocal3gLessThanOrEqualTo(String value) {
            addCriterion("IS_LOCAL_3G <=", value, "isLocal3g");
            return (Criteria) this;
        }

        public Criteria andIsLocal3gLike(String value) {
            addCriterion("IS_LOCAL_3G like", value, "isLocal3g");
            return (Criteria) this;
        }

        public Criteria andIsLocal3gNotLike(String value) {
            addCriterion("IS_LOCAL_3G not like", value, "isLocal3g");
            return (Criteria) this;
        }

        public Criteria andIsLocal3gIn(List<String> values) {
            addCriterion("IS_LOCAL_3G in", values, "isLocal3g");
            return (Criteria) this;
        }

        public Criteria andIsLocal3gNotIn(List<String> values) {
            addCriterion("IS_LOCAL_3G not in", values, "isLocal3g");
            return (Criteria) this;
        }

        public Criteria andIsLocal3gBetween(String value1, String value2) {
            addCriterion("IS_LOCAL_3G between", value1, value2, "isLocal3g");
            return (Criteria) this;
        }

        public Criteria andIsLocal3gNotBetween(String value1, String value2) {
            addCriterion("IS_LOCAL_3G not between", value1, value2, "isLocal3g");
            return (Criteria) this;
        }

        public Criteria andCityIdParIsNull() {
            addCriterion("CITY_ID_PAR is null");
            return (Criteria) this;
        }

        public Criteria andCityIdParIsNotNull() {
            addCriterion("CITY_ID_PAR is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdParEqualTo(String value) {
            addCriterion("CITY_ID_PAR =", value, "cityIdPar");
            return (Criteria) this;
        }

        public Criteria andCityIdParNotEqualTo(String value) {
            addCriterion("CITY_ID_PAR <>", value, "cityIdPar");
            return (Criteria) this;
        }

        public Criteria andCityIdParGreaterThan(String value) {
            addCriterion("CITY_ID_PAR >", value, "cityIdPar");
            return (Criteria) this;
        }

        public Criteria andCityIdParGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_ID_PAR >=", value, "cityIdPar");
            return (Criteria) this;
        }

        public Criteria andCityIdParLessThan(String value) {
            addCriterion("CITY_ID_PAR <", value, "cityIdPar");
            return (Criteria) this;
        }

        public Criteria andCityIdParLessThanOrEqualTo(String value) {
            addCriterion("CITY_ID_PAR <=", value, "cityIdPar");
            return (Criteria) this;
        }

        public Criteria andCityIdParLike(String value) {
            addCriterion("CITY_ID_PAR like", value, "cityIdPar");
            return (Criteria) this;
        }

        public Criteria andCityIdParNotLike(String value) {
            addCriterion("CITY_ID_PAR not like", value, "cityIdPar");
            return (Criteria) this;
        }

        public Criteria andCityIdParIn(List<String> values) {
            addCriterion("CITY_ID_PAR in", values, "cityIdPar");
            return (Criteria) this;
        }

        public Criteria andCityIdParNotIn(List<String> values) {
            addCriterion("CITY_ID_PAR not in", values, "cityIdPar");
            return (Criteria) this;
        }

        public Criteria andCityIdParBetween(String value1, String value2) {
            addCriterion("CITY_ID_PAR between", value1, value2, "cityIdPar");
            return (Criteria) this;
        }

        public Criteria andCityIdParNotBetween(String value1, String value2) {
            addCriterion("CITY_ID_PAR not between", value1, value2, "cityIdPar");
            return (Criteria) this;
        }

        public Criteria andCityIdParDescIsNull() {
            addCriterion("CITY_ID_PAR_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCityIdParDescIsNotNull() {
            addCriterion("CITY_ID_PAR_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdParDescEqualTo(String value) {
            addCriterion("CITY_ID_PAR_DESC =", value, "cityIdParDesc");
            return (Criteria) this;
        }

        public Criteria andCityIdParDescNotEqualTo(String value) {
            addCriterion("CITY_ID_PAR_DESC <>", value, "cityIdParDesc");
            return (Criteria) this;
        }

        public Criteria andCityIdParDescGreaterThan(String value) {
            addCriterion("CITY_ID_PAR_DESC >", value, "cityIdParDesc");
            return (Criteria) this;
        }

        public Criteria andCityIdParDescGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_ID_PAR_DESC >=", value, "cityIdParDesc");
            return (Criteria) this;
        }

        public Criteria andCityIdParDescLessThan(String value) {
            addCriterion("CITY_ID_PAR_DESC <", value, "cityIdParDesc");
            return (Criteria) this;
        }

        public Criteria andCityIdParDescLessThanOrEqualTo(String value) {
            addCriterion("CITY_ID_PAR_DESC <=", value, "cityIdParDesc");
            return (Criteria) this;
        }

        public Criteria andCityIdParDescLike(String value) {
            addCriterion("CITY_ID_PAR_DESC like", value, "cityIdParDesc");
            return (Criteria) this;
        }

        public Criteria andCityIdParDescNotLike(String value) {
            addCriterion("CITY_ID_PAR_DESC not like", value, "cityIdParDesc");
            return (Criteria) this;
        }

        public Criteria andCityIdParDescIn(List<String> values) {
            addCriterion("CITY_ID_PAR_DESC in", values, "cityIdParDesc");
            return (Criteria) this;
        }

        public Criteria andCityIdParDescNotIn(List<String> values) {
            addCriterion("CITY_ID_PAR_DESC not in", values, "cityIdParDesc");
            return (Criteria) this;
        }

        public Criteria andCityIdParDescBetween(String value1, String value2) {
            addCriterion("CITY_ID_PAR_DESC between", value1, value2, "cityIdParDesc");
            return (Criteria) this;
        }

        public Criteria andCityIdParDescNotBetween(String value1, String value2) {
            addCriterion("CITY_ID_PAR_DESC not between", value1, value2, "cityIdParDesc");
            return (Criteria) this;
        }

        public Criteria andCustTypeIsNull() {
            addCriterion("CUST_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCustTypeIsNotNull() {
            addCriterion("CUST_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCustTypeEqualTo(String value) {
            addCriterion("CUST_TYPE =", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeNotEqualTo(String value) {
            addCriterion("CUST_TYPE <>", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeGreaterThan(String value) {
            addCriterion("CUST_TYPE >", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_TYPE >=", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeLessThan(String value) {
            addCriterion("CUST_TYPE <", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeLessThanOrEqualTo(String value) {
            addCriterion("CUST_TYPE <=", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeLike(String value) {
            addCriterion("CUST_TYPE like", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeNotLike(String value) {
            addCriterion("CUST_TYPE not like", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeIn(List<String> values) {
            addCriterion("CUST_TYPE in", values, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeNotIn(List<String> values) {
            addCriterion("CUST_TYPE not in", values, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeBetween(String value1, String value2) {
            addCriterion("CUST_TYPE between", value1, value2, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeNotBetween(String value1, String value2) {
            addCriterion("CUST_TYPE not between", value1, value2, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeDescIsNull() {
            addCriterion("CUST_TYPE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCustTypeDescIsNotNull() {
            addCriterion("CUST_TYPE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCustTypeDescEqualTo(String value) {
            addCriterion("CUST_TYPE_DESC =", value, "custTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCustTypeDescNotEqualTo(String value) {
            addCriterion("CUST_TYPE_DESC <>", value, "custTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCustTypeDescGreaterThan(String value) {
            addCriterion("CUST_TYPE_DESC >", value, "custTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCustTypeDescGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_TYPE_DESC >=", value, "custTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCustTypeDescLessThan(String value) {
            addCriterion("CUST_TYPE_DESC <", value, "custTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCustTypeDescLessThanOrEqualTo(String value) {
            addCriterion("CUST_TYPE_DESC <=", value, "custTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCustTypeDescLike(String value) {
            addCriterion("CUST_TYPE_DESC like", value, "custTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCustTypeDescNotLike(String value) {
            addCriterion("CUST_TYPE_DESC not like", value, "custTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCustTypeDescIn(List<String> values) {
            addCriterion("CUST_TYPE_DESC in", values, "custTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCustTypeDescNotIn(List<String> values) {
            addCriterion("CUST_TYPE_DESC not in", values, "custTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCustTypeDescBetween(String value1, String value2) {
            addCriterion("CUST_TYPE_DESC between", value1, value2, "custTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCustTypeDescNotBetween(String value1, String value2) {
            addCriterion("CUST_TYPE_DESC not between", value1, value2, "custTypeDesc");
            return (Criteria) this;
        }

        public Criteria andHisSaleModeIsNull() {
            addCriterion("HIS_SALE_MODE is null");
            return (Criteria) this;
        }

        public Criteria andHisSaleModeIsNotNull() {
            addCriterion("HIS_SALE_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andHisSaleModeEqualTo(String value) {
            addCriterion("HIS_SALE_MODE =", value, "hisSaleMode");
            return (Criteria) this;
        }

        public Criteria andHisSaleModeNotEqualTo(String value) {
            addCriterion("HIS_SALE_MODE <>", value, "hisSaleMode");
            return (Criteria) this;
        }

        public Criteria andHisSaleModeGreaterThan(String value) {
            addCriterion("HIS_SALE_MODE >", value, "hisSaleMode");
            return (Criteria) this;
        }

        public Criteria andHisSaleModeGreaterThanOrEqualTo(String value) {
            addCriterion("HIS_SALE_MODE >=", value, "hisSaleMode");
            return (Criteria) this;
        }

        public Criteria andHisSaleModeLessThan(String value) {
            addCriterion("HIS_SALE_MODE <", value, "hisSaleMode");
            return (Criteria) this;
        }

        public Criteria andHisSaleModeLessThanOrEqualTo(String value) {
            addCriterion("HIS_SALE_MODE <=", value, "hisSaleMode");
            return (Criteria) this;
        }

        public Criteria andHisSaleModeLike(String value) {
            addCriterion("HIS_SALE_MODE like", value, "hisSaleMode");
            return (Criteria) this;
        }

        public Criteria andHisSaleModeNotLike(String value) {
            addCriterion("HIS_SALE_MODE not like", value, "hisSaleMode");
            return (Criteria) this;
        }

        public Criteria andHisSaleModeIn(List<String> values) {
            addCriterion("HIS_SALE_MODE in", values, "hisSaleMode");
            return (Criteria) this;
        }

        public Criteria andHisSaleModeNotIn(List<String> values) {
            addCriterion("HIS_SALE_MODE not in", values, "hisSaleMode");
            return (Criteria) this;
        }

        public Criteria andHisSaleModeBetween(String value1, String value2) {
            addCriterion("HIS_SALE_MODE between", value1, value2, "hisSaleMode");
            return (Criteria) this;
        }

        public Criteria andHisSaleModeNotBetween(String value1, String value2) {
            addCriterion("HIS_SALE_MODE not between", value1, value2, "hisSaleMode");
            return (Criteria) this;
        }

        public Criteria andUserNoBssIsNull() {
            addCriterion("USER_NO_BSS is null");
            return (Criteria) this;
        }

        public Criteria andUserNoBssIsNotNull() {
            addCriterion("USER_NO_BSS is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoBssEqualTo(String value) {
            addCriterion("USER_NO_BSS =", value, "userNoBss");
            return (Criteria) this;
        }

        public Criteria andUserNoBssNotEqualTo(String value) {
            addCriterion("USER_NO_BSS <>", value, "userNoBss");
            return (Criteria) this;
        }

        public Criteria andUserNoBssGreaterThan(String value) {
            addCriterion("USER_NO_BSS >", value, "userNoBss");
            return (Criteria) this;
        }

        public Criteria andUserNoBssGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NO_BSS >=", value, "userNoBss");
            return (Criteria) this;
        }

        public Criteria andUserNoBssLessThan(String value) {
            addCriterion("USER_NO_BSS <", value, "userNoBss");
            return (Criteria) this;
        }

        public Criteria andUserNoBssLessThanOrEqualTo(String value) {
            addCriterion("USER_NO_BSS <=", value, "userNoBss");
            return (Criteria) this;
        }

        public Criteria andUserNoBssLike(String value) {
            addCriterion("USER_NO_BSS like", value, "userNoBss");
            return (Criteria) this;
        }

        public Criteria andUserNoBssNotLike(String value) {
            addCriterion("USER_NO_BSS not like", value, "userNoBss");
            return (Criteria) this;
        }

        public Criteria andUserNoBssIn(List<String> values) {
            addCriterion("USER_NO_BSS in", values, "userNoBss");
            return (Criteria) this;
        }

        public Criteria andUserNoBssNotIn(List<String> values) {
            addCriterion("USER_NO_BSS not in", values, "userNoBss");
            return (Criteria) this;
        }

        public Criteria andUserNoBssBetween(String value1, String value2) {
            addCriterion("USER_NO_BSS between", value1, value2, "userNoBss");
            return (Criteria) this;
        }

        public Criteria andUserNoBssNotBetween(String value1, String value2) {
            addCriterion("USER_NO_BSS not between", value1, value2, "userNoBss");
            return (Criteria) this;
        }

        public Criteria andCycleIdIsNull() {
            addCriterion("CYCLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCycleIdIsNotNull() {
            addCriterion("CYCLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCycleIdEqualTo(Date value) {
            addCriterion("CYCLE_ID =", value, "cycleId");
            return (Criteria) this;
        }

        public Criteria andCycleIdNotEqualTo(Date value) {
            addCriterion("CYCLE_ID <>", value, "cycleId");
            return (Criteria) this;
        }

        public Criteria andCycleIdGreaterThan(Date value) {
            addCriterion("CYCLE_ID >", value, "cycleId");
            return (Criteria) this;
        }

        public Criteria andCycleIdGreaterThanOrEqualTo(Date value) {
            addCriterion("CYCLE_ID >=", value, "cycleId");
            return (Criteria) this;
        }

        public Criteria andCycleIdLessThan(Date value) {
            addCriterion("CYCLE_ID <", value, "cycleId");
            return (Criteria) this;
        }

        public Criteria andCycleIdLessThanOrEqualTo(Date value) {
            addCriterion("CYCLE_ID <=", value, "cycleId");
            return (Criteria) this;
        }

        public Criteria andCycleIdIn(List<Date> values) {
            addCriterion("CYCLE_ID in", values, "cycleId");
            return (Criteria) this;
        }

        public Criteria andCycleIdNotIn(List<Date> values) {
            addCriterion("CYCLE_ID not in", values, "cycleId");
            return (Criteria) this;
        }

        public Criteria andCycleIdBetween(Date value1, Date value2) {
            addCriterion("CYCLE_ID between", value1, value2, "cycleId");
            return (Criteria) this;
        }

        public Criteria andCycleIdNotBetween(Date value1, Date value2) {
            addCriterion("CYCLE_ID not between", value1, value2, "cycleId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}