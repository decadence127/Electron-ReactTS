package Utils;

public class ConstTypes {
    public static class ActionTypes{
        public static final int START_CONNECTION = 1;
        public static final int CLOSE_CONNECTION = -1;
        public static final int LOGIN_ACTION = 2;
        public static final int REGISTER_ACTION = 3;
        public static final int CALC_GOODS_ACTION = 4;
        public static final int CALC_AUTO_ACTION = 5;
        public static final int GET_USERS_ACTION = 6;
        public static final int GET_UNIT_LIST = 7;
        private ActionTypes(){};
    }
   public static class UserRoles{
        public static final int User = 1;
        public static final int Operator = 2;
        public static final int Administrator = 3;
        private UserRoles(){};
    }
    public static class ExecutionResult {
        public static final int ERROR_CODE = 1;
        public static final int SUCCESS_CODE = 0;
        private ExecutionResult() {};
    }

    private ConstTypes(){};
}
