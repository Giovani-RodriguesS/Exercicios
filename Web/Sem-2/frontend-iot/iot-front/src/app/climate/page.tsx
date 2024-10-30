import ClimateData from "@/components/climate/ClimateData";
import Header from "@/components/layout/Header";
import Sidebar from "@/components/layout/Sidebar";

export default function Climate () {
    return (
        <div className="flex">
            <Sidebar/>
            <div className="flex-1">
                <Header title="Clima"/>
                <main>
                    <h1>Clima do últimos 10 dias</h1>
                    <ClimateData/>
                </main>
            </div>
        </div>
    );
}