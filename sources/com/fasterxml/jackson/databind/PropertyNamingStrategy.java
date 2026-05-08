package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import defpackage.akb;
import io.jsonwebtoken.JwtParser;
import java.io.Serializable;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public class PropertyNamingStrategy implements Serializable {
    private static final long serialVersionUID = 2;

    @Deprecated
    public static final PropertyNamingStrategy LOWER_CAMEL_CASE = new PropertyNamingStrategy();

    @Deprecated
    public static final PropertyNamingStrategy UPPER_CAMEL_CASE = new UpperCamelCaseStrategy(false);

    @Deprecated
    public static final PropertyNamingStrategy SNAKE_CASE = new SnakeCaseStrategy(false);

    @Deprecated
    public static final PropertyNamingStrategy LOWER_CASE = new LowerCaseStrategy(false);

    @Deprecated
    public static final PropertyNamingStrategy KEBAB_CASE = new KebabCaseStrategy(false);

    @Deprecated
    public static final PropertyNamingStrategy LOWER_DOT_CASE = new LowerDotCaseStrategy(false);

    @Deprecated
    public static class KebabCaseStrategy extends PropertyNamingStrategyBase {
        public KebabCaseStrategy(boolean z) {
            super(z);
        }

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase
        public String translate(String str) {
            return PropertyNamingStrategyBase.translateLowerCaseWithSeparator(str, '-');
        }
    }

    @Deprecated
    public static class LowerCaseStrategy extends PropertyNamingStrategyBase {
        public LowerCaseStrategy(boolean z) {
            super(z);
        }

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase
        public String translate(String str) {
            return str.toLowerCase();
        }
    }

    @Deprecated
    public static class LowerDotCaseStrategy extends PropertyNamingStrategyBase {
        public LowerDotCaseStrategy(boolean z) {
            super(z);
        }

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase
        public String translate(String str) {
            return PropertyNamingStrategyBase.translateLowerCaseWithSeparator(str, JwtParser.SEPARATOR_CHAR);
        }
    }

    @Deprecated
    public static abstract class PropertyNamingStrategyBase extends PropertyNamingStrategy {
        public PropertyNamingStrategyBase(boolean z) {
            if (z) {
                String simpleName = getClass().getSimpleName();
                Logger.getLogger(getClass().getName()).warning(akb.k("PropertyNamingStrategy.", simpleName, " is used but it has been deprecated due to risk of deadlock. Consider using PropertyNamingStrategies.", simpleName, " instead. See https://github.com/FasterXML/jackson-databind/issues/2715 for more details."));
            }
        }

        public static String translateLowerCaseWithSeparator(String str, char c) {
            int length;
            if (str == null || (length = str.length()) == 0) {
                return str;
            }
            StringBuilder sb = new StringBuilder((length >> 1) + length);
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                char lowerCase = Character.toLowerCase(cCharAt);
                if (lowerCase == cCharAt) {
                    if (i > 1) {
                        sb.insert(sb.length() - 1, c);
                    }
                    i = 0;
                } else {
                    if (i == 0 && i2 > 0) {
                        sb.append(c);
                    }
                    i++;
                }
                sb.append(lowerCase);
            }
            return sb.toString();
        }

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy
        public String nameForConstructorParameter(MapperConfig<?> mapperConfig, AnnotatedParameter annotatedParameter, String str) {
            return translate(str);
        }

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy
        public String nameForField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, String str) {
            return translate(str);
        }

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy
        public String nameForGetterMethod(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, String str) {
            return translate(str);
        }

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy
        public String nameForSetterMethod(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, String str) {
            return translate(str);
        }

        public abstract String translate(String str);
    }

    @Deprecated
    public static class SnakeCaseStrategy extends PropertyNamingStrategyBase {
        public SnakeCaseStrategy(boolean z) {
            super(z);
        }

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase
        public String translate(String str) {
            if (str == null) {
                return str;
            }
            int length = str.length();
            StringBuilder sb = new StringBuilder(length * 2);
            int i = 0;
            boolean z = false;
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (i2 > 0 || cCharAt != '_') {
                    if (Character.isUpperCase(cCharAt)) {
                        if (!z && i > 0 && sb.charAt(i - 1) != '_') {
                            sb.append('_');
                            i++;
                        }
                        cCharAt = Character.toLowerCase(cCharAt);
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(cCharAt);
                    i++;
                }
            }
            return i > 0 ? sb.toString() : str;
        }
    }

    @Deprecated
    public static class UpperCamelCaseStrategy extends PropertyNamingStrategyBase {
        public UpperCamelCaseStrategy(boolean z) {
            super(z);
        }

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase
        public String translate(String str) {
            char cCharAt;
            char upperCase;
            if (str == null || str.isEmpty() || cCharAt == (upperCase = Character.toUpperCase((cCharAt = str.charAt(0))))) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str);
            sb.setCharAt(0, upperCase);
            return sb.toString();
        }
    }

    public String nameForConstructorParameter(MapperConfig<?> mapperConfig, AnnotatedParameter annotatedParameter, String str) {
        return str;
    }

    public String nameForField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, String str) {
        return str;
    }

    public String nameForGetterMethod(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, String str) {
        return str;
    }

    public String nameForSetterMethod(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, String str) {
        return str;
    }
}
