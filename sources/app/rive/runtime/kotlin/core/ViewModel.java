package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.errors.ViewModelException;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.kc9;
import defpackage.ojh;
import defpackage.p6;
import defpackage.t92;
import defpackage.w40;
import defpackage.wl7;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002#$B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0082 J\u0011\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0082 J\u0019\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006H\u0082 J\u0019\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0015\u001a\u00020\u0003H\u0082 J\u0011\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0003H\u0082 J\u0011\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0003H\u0082 J\u0011\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0003H\u0082 J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010!\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u0006J\u000e\u0010\"\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\b¨\u0006%"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModel;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "unsafeCppPointer", "", "(J)V", "instanceCount", "", "getInstanceCount", "()I", "name", "", "getName", "()Ljava/lang/String;", "properties", "", "Lapp/rive/runtime/kotlin/core/ViewModel$Property;", "getProperties", "()Ljava/util/List;", "propertyCount", "getPropertyCount", "cppCreateBlankInstance", "cppPointer", "cppCreateDefaultInstance", "cppCreateInstanceFromIndex", "index", "cppCreateInstanceFromName", "cppGetProperties", "cppInstanceCount", "cppName", "cppPropertyCount", "createBlankInstance", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "createDefaultInstance", "createInstanceFromIndex", "createInstanceFromName", "Property", "PropertyDataType", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class ViewModel extends NativeObject {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModel$Property;", "", "type", "Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType;", "name", "", "(Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getType", "()Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
    public static final /* data */ class Property {
        public static final int $stable = 0;
        private final String name;
        private final PropertyDataType type;

        public Property(PropertyDataType propertyDataType, String str) {
            propertyDataType.getClass();
            str.getClass();
            this.type = propertyDataType;
            this.name = str;
        }

        public static /* synthetic */ Property copy$default(Property property, PropertyDataType propertyDataType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                propertyDataType = property.type;
            }
            if ((i & 2) != 0) {
                str = property.name;
            }
            return property.copy(propertyDataType, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final PropertyDataType getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final Property copy(PropertyDataType type, String name) {
            type.getClass();
            name.getClass();
            return new Property(type, name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Property)) {
                return false;
            }
            Property property = (Property) other;
            return this.type == property.type && wl7.b(this.name, property.name);
        }

        public final String getName() {
            return this.name;
        }

        public final PropertyDataType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.name.hashCode() + (this.type.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Property(type=");
            sb.append(this.type);
            sb.append(", name=");
            return w40.f(sb, this.name, ')');
        }
    }

    public ViewModel(long j) {
        super(j);
    }

    private final native long cppCreateBlankInstance(long cppPointer);

    private final native long cppCreateDefaultInstance(long cppPointer);

    private final native long cppCreateInstanceFromIndex(long cppPointer, int index);

    private final native long cppCreateInstanceFromName(long cppPointer, String name);

    private final native List<Property> cppGetProperties(long cppPointer);

    private final native int cppInstanceCount(long cppPointer);

    private final native String cppName(long cppPointer);

    private final native int cppPropertyCount(long cppPointer);

    public final ViewModelInstance createBlankInstance() throws ViewModelException {
        long jCppCreateBlankInstance = cppCreateBlankInstance(getCppPointer());
        if (jCppCreateBlankInstance == 0) {
            throw new ViewModelException("Could not create a blank ViewModel instance");
        }
        ViewModelInstance viewModelInstance = new ViewModelInstance(jCppCreateBlankInstance);
        getDependencies().add(viewModelInstance);
        return viewModelInstance;
    }

    public final ViewModelInstance createDefaultInstance() throws ViewModelException {
        long jCppCreateDefaultInstance = cppCreateDefaultInstance(getCppPointer());
        if (jCppCreateDefaultInstance == 0) {
            throw new ViewModelException("Could not create default ViewModel instance");
        }
        ViewModelInstance viewModelInstance = new ViewModelInstance(jCppCreateDefaultInstance);
        getDependencies().add(viewModelInstance);
        return viewModelInstance;
    }

    public final ViewModelInstance createInstanceFromIndex(int index) throws ViewModelException {
        long jCppCreateInstanceFromIndex = cppCreateInstanceFromIndex(getCppPointer(), index);
        if (jCppCreateInstanceFromIndex == 0) {
            throw new ViewModelException(p6.c(index, "ViewModel instance not found: "));
        }
        ViewModelInstance viewModelInstance = new ViewModelInstance(jCppCreateInstanceFromIndex);
        getDependencies().add(viewModelInstance);
        return viewModelInstance;
    }

    public final ViewModelInstance createInstanceFromName(String name) throws ViewModelException {
        name.getClass();
        long jCppCreateInstanceFromName = cppCreateInstanceFromName(getCppPointer(), name);
        if (jCppCreateInstanceFromName == 0) {
            throw new ViewModelException("ViewModel instance not found: ".concat(name));
        }
        ViewModelInstance viewModelInstance = new ViewModelInstance(jCppCreateInstanceFromName);
        getDependencies().add(viewModelInstance);
        return viewModelInstance;
    }

    public final int getInstanceCount() {
        return cppInstanceCount(getCppPointer());
    }

    public final String getName() {
        return cppName(getCppPointer());
    }

    public final List<Property> getProperties() {
        return cppGetProperties(getCppPointer());
    }

    public final int getPropertyCount() {
        return cppPropertyCount(getCppPointer());
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NONE", "STRING", "NUMBER", "BOOLEAN", "COLOR", "LIST", "ENUM", "TRIGGER", "VIEW_MODEL", "Companion", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
    public static final class PropertyDataType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PropertyDataType[] $VALUES;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Map<Integer, PropertyDataType> map;
        private final int value;
        public static final PropertyDataType NONE = new PropertyDataType("NONE", 0, 0);
        public static final PropertyDataType STRING = new PropertyDataType("STRING", 1, 1);
        public static final PropertyDataType NUMBER = new PropertyDataType("NUMBER", 2, 2);
        public static final PropertyDataType BOOLEAN = new PropertyDataType("BOOLEAN", 3, 3);
        public static final PropertyDataType COLOR = new PropertyDataType("COLOR", 4, 4);
        public static final PropertyDataType LIST = new PropertyDataType("LIST", 5, 5);
        public static final PropertyDataType ENUM = new PropertyDataType("ENUM", 6, 6);
        public static final PropertyDataType TRIGGER = new PropertyDataType("TRIGGER", 7, 7);
        public static final PropertyDataType VIEW_MODEL = new PropertyDataType("VIEW_MODEL", 8, 8);

        private static final /* synthetic */ PropertyDataType[] $values() {
            return new PropertyDataType[]{NONE, STRING, NUMBER, BOOLEAN, COLOR, LIST, ENUM, TRIGGER, VIEW_MODEL};
        }

        static {
            PropertyDataType[] propertyDataTypeArr$values = $values();
            $VALUES = propertyDataTypeArr$values;
            $ENTRIES = ojh.k(propertyDataTypeArr$values);
            INSTANCE = new Companion(null);
            EnumEntries<PropertyDataType> entries = getEntries();
            int iV = kc9.V(t92.r0(entries, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iV < 16 ? 16 : iV);
            for (PropertyDataType propertyDataType : entries) {
                linkedHashMap.put(Integer.valueOf(propertyDataType.value), propertyDataType);
            }
            map = linkedHashMap;
        }

        private PropertyDataType(String str, int i, int i2) {
            this.value = i2;
        }

        public static final PropertyDataType fromInt(int i) {
            return INSTANCE.fromInt(i);
        }

        public static EnumEntries<PropertyDataType> getEntries() {
            return $ENTRIES;
        }

        public static PropertyDataType valueOf(String str) {
            return (PropertyDataType) Enum.valueOf(PropertyDataType.class, str);
        }

        public static PropertyDataType[] values() {
            return (PropertyDataType[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType$Companion;", "", "()V", "map", "", "", "Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType;", "fromInt", "type", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final PropertyDataType fromInt(int type) {
                return (PropertyDataType) PropertyDataType.map.get(Integer.valueOf(type));
            }

            private Companion() {
            }
        }
    }
}
