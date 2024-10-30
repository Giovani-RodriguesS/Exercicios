import Header from "@/components/layout/Header";
import Sidebar from "@/components/layout/Sidebar";

export default function Report() {
    return (
        <div className="flex h-screen bg-neutral-100">
            <Sidebar/>
            <div className="flex-1 mr-5 mt-10">
                <Header title="Reports"/>
            </div>
        </div>
    );
}