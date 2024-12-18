'use client'
import Header from "@/components/layout/Header";
import Sidebar from "@/components/layout/Sidebar";
import Main from "@/components/main/Main"

export default function Home() {
    return (
        <div className="flex h-screen bg-neutral-100">
            <Sidebar/>
            <div className="flex-1 mr-5 mt-10">
                <Header title="Home" user="Giovani"/>
                <Main home={true}/>
            </div>
        </div>
    );
}
