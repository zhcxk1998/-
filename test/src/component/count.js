import React from 'react';
class Count extends React.Component {
    render() {
        var textStyle = {
            fontSize: 72,
            fontFamily: "sans-serif",
            color: "#333",
            fontWeight: "bold",
        };
        return (
            <div style={textStyle}>
                {this.props.display}
            </div>
        );
    }
}


class CountParent extends React.Component {
    constructor(props) {
        super(props);
        this.state = {count: 0};
        this.increase = this.increase.bind(this);
    }

    increase(e) {
        var time=this.state.count;
        if (e.shiftKey)
            time+=10;
        else
            time+=1;

        this.setState({
            count: time
        });
    }

    render() {

        var backgroundStyle = {
            padding: 50,
            backgroundColor: "#FFC53A",
            width: 250,
            height: 100,
            borderRadius: 20,
            textAlign: "center",
            margin:"auto"

        };
        var buttonStyle = {
            fontSize: "1em",
            width: 30,
            height: 30,
            fontFamily: "sans-serif",
            color: "#333",
            fontWeight: "bold",
            lineHeight: "3px"
        };
        return (
            <div style={backgroundStyle}>
                <Count display={this.state.count}/>
                <button onClick={this.increase} style={buttonStyle}>+</button>
            </div>
        );

    }
}


export default CountParent;