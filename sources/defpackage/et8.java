package defpackage;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class et8 implements Iterable<ModuleHolder>, ze8 {
    public final /* synthetic */ List<ModuleSpec> a;
    public final /* synthetic */ Map<String, ReactModuleInfo> b;

    public static final class a implements Iterator<ModuleHolder>, ze8 {
        public final /* synthetic */ juc a;
        public final /* synthetic */ List<ModuleSpec> b;
        public final /* synthetic */ Map<String, ReactModuleInfo> c;

        public a(juc jucVar, List<ModuleSpec> list, Map<String, ReactModuleInfo> map) {
            this.a = jucVar;
            this.b = list;
            this.c = map;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a.element < this.b.size();
        }

        @Override // java.util.Iterator
        public final ModuleHolder next() {
            juc jucVar = this.a;
            int i = jucVar.element;
            jucVar.element = i + 1;
            ModuleSpec moduleSpec = this.b.get(i);
            String strModuleName = moduleSpec.moduleName();
            ReactModuleInfo reactModuleInfo = this.c.get(strModuleName);
            if (reactModuleInfo != null) {
                return new ModuleHolder(reactModuleInfo, moduleSpec.provider());
            }
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, strModuleName);
            try {
                NativeModule nativeModule = moduleSpec.provider().get();
                nativeModule.getClass();
                NativeModule nativeModule2 = nativeModule;
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                return new ModuleHolder(nativeModule2);
            } catch (Throwable th) {
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                throw th;
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public et8(List<ModuleSpec> list, Map<String, ReactModuleInfo> map) {
        this.a = list;
        this.b = map;
    }

    @Override // java.lang.Iterable
    public final Iterator<ModuleHolder> iterator() {
        return new a(new juc(), this.a, this.b);
    }
}
