package cn.sz.lwt.pojo;

import java.util.ArrayList;
import java.util.List;

public class CondimentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CondimentExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCcondimentIsNull() {
            addCriterion("ccondiment is null");
            return (Criteria) this;
        }

        public Criteria andCcondimentIsNotNull() {
            addCriterion("ccondiment is not null");
            return (Criteria) this;
        }

        public Criteria andCcondimentEqualTo(String value) {
            addCriterion("ccondiment =", value, "ccondiment");
            return (Criteria) this;
        }

        public Criteria andCcondimentNotEqualTo(String value) {
            addCriterion("ccondiment <>", value, "ccondiment");
            return (Criteria) this;
        }

        public Criteria andCcondimentGreaterThan(String value) {
            addCriterion("ccondiment >", value, "ccondiment");
            return (Criteria) this;
        }

        public Criteria andCcondimentGreaterThanOrEqualTo(String value) {
            addCriterion("ccondiment >=", value, "ccondiment");
            return (Criteria) this;
        }

        public Criteria andCcondimentLessThan(String value) {
            addCriterion("ccondiment <", value, "ccondiment");
            return (Criteria) this;
        }

        public Criteria andCcondimentLessThanOrEqualTo(String value) {
            addCriterion("ccondiment <=", value, "ccondiment");
            return (Criteria) this;
        }

        public Criteria andCcondimentLike(String value) {
            addCriterion("ccondiment like", value, "ccondiment");
            return (Criteria) this;
        }

        public Criteria andCcondimentNotLike(String value) {
            addCriterion("ccondiment not like", value, "ccondiment");
            return (Criteria) this;
        }

        public Criteria andCcondimentIn(List<String> values) {
            addCriterion("ccondiment in", values, "ccondiment");
            return (Criteria) this;
        }

        public Criteria andCcondimentNotIn(List<String> values) {
            addCriterion("ccondiment not in", values, "ccondiment");
            return (Criteria) this;
        }

        public Criteria andCcondimentBetween(String value1, String value2) {
            addCriterion("ccondiment between", value1, value2, "ccondiment");
            return (Criteria) this;
        }

        public Criteria andCcondimentNotBetween(String value1, String value2) {
            addCriterion("ccondiment not between", value1, value2, "ccondiment");
            return (Criteria) this;
        }

        public Criteria andCproductIsNull() {
            addCriterion("cproduct is null");
            return (Criteria) this;
        }

        public Criteria andCproductIsNotNull() {
            addCriterion("cproduct is not null");
            return (Criteria) this;
        }

        public Criteria andCproductEqualTo(String value) {
            addCriterion("cproduct =", value, "cproduct");
            return (Criteria) this;
        }

        public Criteria andCproductNotEqualTo(String value) {
            addCriterion("cproduct <>", value, "cproduct");
            return (Criteria) this;
        }

        public Criteria andCproductGreaterThan(String value) {
            addCriterion("cproduct >", value, "cproduct");
            return (Criteria) this;
        }

        public Criteria andCproductGreaterThanOrEqualTo(String value) {
            addCriterion("cproduct >=", value, "cproduct");
            return (Criteria) this;
        }

        public Criteria andCproductLessThan(String value) {
            addCriterion("cproduct <", value, "cproduct");
            return (Criteria) this;
        }

        public Criteria andCproductLessThanOrEqualTo(String value) {
            addCriterion("cproduct <=", value, "cproduct");
            return (Criteria) this;
        }

        public Criteria andCproductLike(String value) {
            addCriterion("cproduct like", value, "cproduct");
            return (Criteria) this;
        }

        public Criteria andCproductNotLike(String value) {
            addCriterion("cproduct not like", value, "cproduct");
            return (Criteria) this;
        }

        public Criteria andCproductIn(List<String> values) {
            addCriterion("cproduct in", values, "cproduct");
            return (Criteria) this;
        }

        public Criteria andCproductNotIn(List<String> values) {
            addCriterion("cproduct not in", values, "cproduct");
            return (Criteria) this;
        }

        public Criteria andCproductBetween(String value1, String value2) {
            addCriterion("cproduct between", value1, value2, "cproduct");
            return (Criteria) this;
        }

        public Criteria andCproductNotBetween(String value1, String value2) {
            addCriterion("cproduct not between", value1, value2, "cproduct");
            return (Criteria) this;
        }

        public Criteria andCspecificationsIsNull() {
            addCriterion("cspecifications is null");
            return (Criteria) this;
        }

        public Criteria andCspecificationsIsNotNull() {
            addCriterion("cspecifications is not null");
            return (Criteria) this;
        }

        public Criteria andCspecificationsEqualTo(Double value) {
            addCriterion("cspecifications =", value, "cspecifications");
            return (Criteria) this;
        }

        public Criteria andCspecificationsNotEqualTo(Double value) {
            addCriterion("cspecifications <>", value, "cspecifications");
            return (Criteria) this;
        }

        public Criteria andCspecificationsGreaterThan(Double value) {
            addCriterion("cspecifications >", value, "cspecifications");
            return (Criteria) this;
        }

        public Criteria andCspecificationsGreaterThanOrEqualTo(Double value) {
            addCriterion("cspecifications >=", value, "cspecifications");
            return (Criteria) this;
        }

        public Criteria andCspecificationsLessThan(Double value) {
            addCriterion("cspecifications <", value, "cspecifications");
            return (Criteria) this;
        }

        public Criteria andCspecificationsLessThanOrEqualTo(Double value) {
            addCriterion("cspecifications <=", value, "cspecifications");
            return (Criteria) this;
        }

        public Criteria andCspecificationsIn(List<Double> values) {
            addCriterion("cspecifications in", values, "cspecifications");
            return (Criteria) this;
        }

        public Criteria andCspecificationsNotIn(List<Double> values) {
            addCriterion("cspecifications not in", values, "cspecifications");
            return (Criteria) this;
        }

        public Criteria andCspecificationsBetween(Double value1, Double value2) {
            addCriterion("cspecifications between", value1, value2, "cspecifications");
            return (Criteria) this;
        }

        public Criteria andCspecificationsNotBetween(Double value1, Double value2) {
            addCriterion("cspecifications not between", value1, value2, "cspecifications");
            return (Criteria) this;
        }

        public Criteria andCintervalIsNull() {
            addCriterion("cinterval is null");
            return (Criteria) this;
        }

        public Criteria andCintervalIsNotNull() {
            addCriterion("cinterval is not null");
            return (Criteria) this;
        }

        public Criteria andCintervalEqualTo(Integer value) {
            addCriterion("cinterval =", value, "cinterval");
            return (Criteria) this;
        }

        public Criteria andCintervalNotEqualTo(Integer value) {
            addCriterion("cinterval <>", value, "cinterval");
            return (Criteria) this;
        }

        public Criteria andCintervalGreaterThan(Integer value) {
            addCriterion("cinterval >", value, "cinterval");
            return (Criteria) this;
        }

        public Criteria andCintervalGreaterThanOrEqualTo(Integer value) {
            addCriterion("cinterval >=", value, "cinterval");
            return (Criteria) this;
        }

        public Criteria andCintervalLessThan(Integer value) {
            addCriterion("cinterval <", value, "cinterval");
            return (Criteria) this;
        }

        public Criteria andCintervalLessThanOrEqualTo(Integer value) {
            addCriterion("cinterval <=", value, "cinterval");
            return (Criteria) this;
        }

        public Criteria andCintervalIn(List<Integer> values) {
            addCriterion("cinterval in", values, "cinterval");
            return (Criteria) this;
        }

        public Criteria andCintervalNotIn(List<Integer> values) {
            addCriterion("cinterval not in", values, "cinterval");
            return (Criteria) this;
        }

        public Criteria andCintervalBetween(Integer value1, Integer value2) {
            addCriterion("cinterval between", value1, value2, "cinterval");
            return (Criteria) this;
        }

        public Criteria andCintervalNotBetween(Integer value1, Integer value2) {
            addCriterion("cinterval not between", value1, value2, "cinterval");
            return (Criteria) this;
        }

        public Criteria andCwaveIsNull() {
            addCriterion("cwave is null");
            return (Criteria) this;
        }

        public Criteria andCwaveIsNotNull() {
            addCriterion("cwave is not null");
            return (Criteria) this;
        }

        public Criteria andCwaveEqualTo(String value) {
            addCriterion("cwave =", value, "cwave");
            return (Criteria) this;
        }

        public Criteria andCwaveNotEqualTo(String value) {
            addCriterion("cwave <>", value, "cwave");
            return (Criteria) this;
        }

        public Criteria andCwaveGreaterThan(String value) {
            addCriterion("cwave >", value, "cwave");
            return (Criteria) this;
        }

        public Criteria andCwaveGreaterThanOrEqualTo(String value) {
            addCriterion("cwave >=", value, "cwave");
            return (Criteria) this;
        }

        public Criteria andCwaveLessThan(String value) {
            addCriterion("cwave <", value, "cwave");
            return (Criteria) this;
        }

        public Criteria andCwaveLessThanOrEqualTo(String value) {
            addCriterion("cwave <=", value, "cwave");
            return (Criteria) this;
        }

        public Criteria andCwaveLike(String value) {
            addCriterion("cwave like", value, "cwave");
            return (Criteria) this;
        }

        public Criteria andCwaveNotLike(String value) {
            addCriterion("cwave not like", value, "cwave");
            return (Criteria) this;
        }

        public Criteria andCwaveIn(List<String> values) {
            addCriterion("cwave in", values, "cwave");
            return (Criteria) this;
        }

        public Criteria andCwaveNotIn(List<String> values) {
            addCriterion("cwave not in", values, "cwave");
            return (Criteria) this;
        }

        public Criteria andCwaveBetween(String value1, String value2) {
            addCriterion("cwave between", value1, value2, "cwave");
            return (Criteria) this;
        }

        public Criteria andCwaveNotBetween(String value1, String value2) {
            addCriterion("cwave not between", value1, value2, "cwave");
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