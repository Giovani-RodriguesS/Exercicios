'use client'

import Header from "@/components/layout/Header";
import Main from "@/components/main/Main";
import Sidebar from "@/components/layout/Sidebar";


export default function User() {
    return (
        <div className="flex h-screen bg-neutral-100">
            <Sidebar/>
            <div className="flex-1 mr-5 mt-10">
                <Header title="Usuários"/>
                <Main user={true}/>
            </div>
        </div>
    );
}