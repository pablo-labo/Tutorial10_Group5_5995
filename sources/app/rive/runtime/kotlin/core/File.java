package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.errors.ArtboardException;
import app.rive.runtime.kotlin.core.errors.ViewModelException;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.akb;
import defpackage.bg;
import defpackage.fh7;
import defpackage.ja;
import defpackage.nic;
import defpackage.oh7;
import defpackage.t92;
import defpackage.wl7;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0017\u0018\u00002\u00020\u0001:\u0001MB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0092 ¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0092 ¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\nH\u0092 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0092 ¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0010\u001a\u00020\fH\u0092 ¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0092 ¢\u0006\u0004\b\u001e\u0010\u0019J \u0010 \u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\nH\u0092 ¢\u0006\u0004\b \u0010!J \u0010#\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0011H\u0092 ¢\u0006\u0004\b#\u0010\u0014J \u0010%\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010$\u001a\u00020\fH\u0092 ¢\u0006\u0004\b%\u0010&J \u0010'\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\nH\u0095 ¢\u0006\u0004\b'\u0010!J\u0018\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020\fH\u0096 ¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010-\u001a\u00020,2\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b-\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u0002002\u0006\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u0002002\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\nH\u0016¢\u0006\u0004\b7\u00108R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010;R\u001a\u0010=\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u00108R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010GR\u0014\u0010L\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u00108¨\u0006N"}, d2 = {"Lapp/rive/runtime/kotlin/core/File;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "", "bytes", "Lapp/rive/runtime/kotlin/core/RendererType;", "rendererType", "Lapp/rive/runtime/kotlin/core/FileAssetLoader;", "fileAssetLoader", "<init>", "([BLapp/rive/runtime/kotlin/core/RendererType;Lapp/rive/runtime/kotlin/core/FileAssetLoader;)V", "", "length", "", "fileAssetLoaderPointer", "import", "([BIIJ)J", "cppPointer", "", "name", "cppArtboardByName", "(JLjava/lang/String;)J", "index", "cppArtboardNameByIndex", "(JI)Ljava/lang/String;", "cppArtboardCount", "(J)I", "", "Lapp/rive/runtime/kotlin/core/File$Enum;", "cppEnums", "(J)Ljava/util/List;", "cppViewModelCount", "viewModelIdx", "cppViewModelByIndex", "(JI)J", "viewModelName", "cppViewModelByName", "artboardPointer", "cppDefaultViewModelForArtboard", "(JJ)J", "cppArtboardByIndex", "pointer", "Lj6g;", "cppDelete", "(J)V", "Lapp/rive/runtime/kotlin/core/Artboard;", "artboard", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/Artboard;", "(I)Lapp/rive/runtime/kotlin/core/Artboard;", "Lapp/rive/runtime/kotlin/core/ViewModel;", "getViewModelByIndex", "(I)Lapp/rive/runtime/kotlin/core/ViewModel;", "getViewModelByName", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/ViewModel;", "defaultViewModelForArtboard", "(Lapp/rive/runtime/kotlin/core/Artboard;)Lapp/rive/runtime/kotlin/core/ViewModel;", "release", "()I", "Lapp/rive/runtime/kotlin/core/RendererType;", "getRendererType", "()Lapp/rive/runtime/kotlin/core/RendererType;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "getFirstArtboard", "()Lapp/rive/runtime/kotlin/core/Artboard;", "firstArtboard", "getArtboardCount", "artboardCount", "getArtboardNames", "()Ljava/util/List;", "artboardNames", "getEnums", "enums", "getViewModelCount", "viewModelCount", "Enum", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public class File extends NativeObject {
    public static final int $stable = 8;
    private final ReentrantLock lock;
    private final RendererType rendererType;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lapp/rive/runtime/kotlin/core/File$Enum;", "", "name", "", "values", "", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
    public static final /* data */ class Enum {
        public static final int $stable = 8;
        private final String name;
        private final List<String> values;

        public Enum(String str, List<String> list) {
            str.getClass();
            list.getClass();
            this.name = str;
            this.values = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Enum copy$default(Enum r0, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = r0.name;
            }
            if ((i & 2) != 0) {
                list = r0.values;
            }
            return r0.copy(str, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final List<String> component2() {
            return this.values;
        }

        public final Enum copy(String name, List<String> values) {
            name.getClass();
            values.getClass();
            return new Enum(name, values);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Enum)) {
                return false;
            }
            Enum r5 = (Enum) other;
            return wl7.b(this.name, r5.name) && wl7.b(this.values, r5.values);
        }

        public final String getName() {
            return this.name;
        }

        public final List<String> getValues() {
            return this.values;
        }

        public int hashCode() {
            return this.values.hashCode() + (this.name.hashCode() * 31);
        }

        public String toString() {
            return "Enum(name=" + this.name + ", values=" + this.values + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public File(byte[] bArr, RendererType rendererType, FileAssetLoader fileAssetLoader) {
        super(0L);
        bArr.getClass();
        rendererType.getClass();
        this.rendererType = rendererType;
        if (fileAssetLoader != null) {
            fileAssetLoader.setRendererType(getRendererType());
        }
        setCppPointer(m13import(bArr, bArr.length, getRendererType().getValue(), fileAssetLoader != null ? fileAssetLoader.getCppPointer() : 0L));
        getRefs().incrementAndGet();
        this.lock = new ReentrantLock();
    }

    private native long cppArtboardByName(long cppPointer, String name);

    private native int cppArtboardCount(long cppPointer);

    private native String cppArtboardNameByIndex(long cppPointer, int index);

    private native long cppDefaultViewModelForArtboard(long cppPointer, long artboardPointer);

    private native List<Enum> cppEnums(long cppPointer);

    private native long cppViewModelByIndex(long cppPointer, int viewModelIdx);

    private native long cppViewModelByName(long cppPointer, String viewModelName);

    private native int cppViewModelCount(long cppPointer);

    /* JADX INFO: renamed from: import, reason: not valid java name */
    private native long m13import(byte[] bytes, int length, int rendererType, long fileAssetLoaderPointer);

    public Artboard artboard(String name) throws ArtboardException {
        name.getClass();
        long jCppArtboardByName = cppArtboardByName(getCppPointer(), name);
        if (jCppArtboardByName != 0) {
            Artboard artboard = new Artboard(jCppArtboardByName, getLock());
            getDependencies().add(artboard);
            return artboard;
        }
        StringBuilder sbM = akb.m("Artboard \"", name, "\" not found. Available Artboards: ");
        List<String> artboardNames = getArtboardNames();
        ArrayList arrayList = new ArrayList(t92.r0(artboardNames, 10));
        Iterator<T> it = artboardNames.iterator();
        while (it.hasNext()) {
            arrayList.add("\"" + ((String) it.next()) + '\"');
        }
        sbM.append(arrayList);
        throw new ArtboardException(sbM.toString());
    }

    public native long cppArtboardByIndex(long cppPointer, int index);

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long pointer);

    public ViewModel defaultViewModelForArtboard(Artboard artboard) throws ViewModelException {
        artboard.getClass();
        long jCppDefaultViewModelForArtboard = cppDefaultViewModelForArtboard(getCppPointer(), artboard.getCppPointer());
        if (jCppDefaultViewModelForArtboard != 0) {
            ViewModel viewModel = new ViewModel(jCppDefaultViewModelForArtboard);
            getDependencies().add(viewModel);
            return viewModel;
        }
        throw new ViewModelException("No default ViewModel found for artboard " + artboard.getName() + JwtParser.SEPARATOR_CHAR);
    }

    public int getArtboardCount() {
        return cppArtboardCount(getCppPointer());
    }

    public List<String> getArtboardNames() {
        oh7 oh7VarH = nic.H(0, getArtboardCount());
        ArrayList arrayList = new ArrayList(t92.r0(oh7VarH, 10));
        Iterator<Integer> it = oh7VarH.iterator();
        while (it.hasNext()) {
            arrayList.add(cppArtboardNameByIndex(getCppPointer(), ((fh7) it).nextInt()));
        }
        return arrayList;
    }

    public List<Enum> getEnums() {
        return cppEnums(getCppPointer());
    }

    public Artboard getFirstArtboard() {
        return artboard(0);
    }

    public ReentrantLock getLock() {
        return this.lock;
    }

    public RendererType getRendererType() {
        return this.rendererType;
    }

    public ViewModel getViewModelByIndex(int viewModelIdx) throws ViewModelException {
        long jCppViewModelByIndex = cppViewModelByIndex(getCppPointer(), viewModelIdx);
        if (jCppViewModelByIndex == 0) {
            throw new ViewModelException(bg.c(JwtParser.SEPARATOR_CHAR, viewModelIdx, "No ViewModel found at index "));
        }
        ViewModel viewModel = new ViewModel(jCppViewModelByIndex);
        getDependencies().add(viewModel);
        return viewModel;
    }

    public ViewModel getViewModelByName(String viewModelName) throws ViewModelException {
        viewModelName.getClass();
        long jCppViewModelByName = cppViewModelByName(getCppPointer(), viewModelName);
        if (jCppViewModelByName == 0) {
            throw new ViewModelException(ja.f(JwtParser.SEPARATOR_CHAR, "No ViewModel found with name ", viewModelName));
        }
        ViewModel viewModel = new ViewModel(jCppViewModelByName);
        getDependencies().add(viewModel);
        return viewModel;
    }

    public int getViewModelCount() {
        return cppViewModelCount(getCppPointer());
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject, app.rive.runtime.kotlin.core.RefCount
    public int release() {
        int iRelease;
        synchronized (getLock()) {
            iRelease = super.release();
        }
        return iRelease;
    }

    public /* synthetic */ File(byte[] bArr, RendererType rendererType, FileAssetLoader fileAssetLoader, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i & 2) != 0 ? Rive.INSTANCE.getDefaultRendererType() : rendererType, (i & 4) != 0 ? null : fileAssetLoader);
    }

    public Artboard artboard(int index) throws ArtboardException {
        long jCppArtboardByIndex = cppArtboardByIndex(getCppPointer(), index);
        if (jCppArtboardByIndex != 0) {
            Artboard artboard = new Artboard(jCppArtboardByIndex, getLock());
            getDependencies().add(artboard);
            return artboard;
        }
        throw new ArtboardException(bg.c(JwtParser.SEPARATOR_CHAR, index, "No Artboard found at index "));
    }
}
