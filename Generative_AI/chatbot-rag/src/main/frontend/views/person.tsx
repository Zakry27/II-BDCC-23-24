import {AutoCrud} from "@vaadin/hilla-react-crud";

export default function Person(){
    return(
        <AutoCrud service={PersonService} model={PersonModel}/>

    )
}