package defpackage;

import expo.modules.adapters.react.ReactAdapterPackage;
import expo.modules.core.BasePackage;
import expo.modules.filesystem.legacy.FileSystemPackage;
import expo.modules.imageloader.ImageLoaderPackage;
import expo.modules.kotlin.edgeToEdge.EdgeToEdgePackage;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class c45 implements hy9 {

    public static class a {
        public static final List<kya> a = Arrays.asList(new ReactAdapterPackage(), new BasePackage(), new FileSystemPackage(), new ImageLoaderPackage(), new EdgeToEdgePackage());
        public static final List<Class<? extends sx9>> b = Arrays.asList(z35.class, n84.class, ua5.class, qa5.class, ag6.class, w17.class, e27.class, lx8.class, f45.class, expo.modules.video.a.class);
    }

    public static List<kya> getPackageList() {
        return a.a;
    }

    @Override // defpackage.hy9
    public List<Class<? extends sx9>> getModulesList() {
        return a.b;
    }
}
