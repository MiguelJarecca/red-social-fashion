import { useState } from "react";

export const UniformOrderBy = () => {

    const onInputOrderChange = (order) => {

    }

    const [isActiveOrder, setIsActiveOrder] = useState(false); // Estado para controlar la clase "active"

    const handleFilterClickOrder = () => {
        setIsActiveOrder(!isActiveOrder);
    }

    return (
        <>
            <h4>5 productos encontrados</h4>

            <div className='order-box'>

                <div className={`order-dropdown ${isActiveOrder ? 'active' : ''}`} >

                    <div className="order-title" onClick={handleFilterClickOrder}>
                        <h3>Ordenar</h3>
                        <div className='order-icon'>
                            <span className='left-icon'></span>
                            <span className='right-icon'></span>
                        </div>
                    </div>
            
                    <div className="order-items">
                        <div 
                            className="order-button" 
                            role="button"
                            >
                                <h4 
                                    style={{ "--i": "1" }}
                                    onClick={()=> onInputOrderChange()}
                                    >
                                    Alfabéticamente, A-Z 
                                    <span></span>
                                </h4>
                        </div>
                        <div 
                            className="order-button" 
                            role="button" 
                            >
                                <h4 
                                    style={{ "--i": "2" }}
                                    >
                                    Alfabéticamente, Z-A 
                                    <span></span>
                                </h4>
                        </div>
                        <div 
                            className="order-button" 
                            role="button" 
                            >
                                <h4 
                                    style={{ "--i": "3" }}
                                    >
                                    Precio, menor a mayor
                                    <span></span>
                                </h4>
                        </div>
                        <div 
                            className="order-button" 
                            role="button" 
                            >
                                <h4 
                                    style={{ "--i": "3" }}
                                    >
                                    Precio, mayor a menor
                                    <span></span>
                                </h4>
                        </div>
                    </div>

                </div>    
            </div>
        </>
    )
}